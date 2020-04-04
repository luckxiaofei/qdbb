/**
 * 用户相关服务
 */
const util = require('../utils/util.js');
const api = require('../config/api.js');


/**
 * Promise封装wx.checkSession
 */
function checkSession() {
    return new Promise(function (resolve, reject) {
        wx.checkSession({
            success: function () {
                resolve(true);
            },
            fail: function () {
                reject(false);
            }
        })
    });
}

/**
 * Promise封装wx.login
 */
function login() {
    return new Promise(function (resolve, reject) {
        wx.login({
            success: function (res) {
                if (res.code) {
                    resolve(res);
                } else {
                    reject(res);
                }
            },
            fail: function (err) {
                reject(err);
            }
        });
    });
}

/**
 * 调用微信登录
 */
function loginByWeixin(userInfo, shareId) {

    return new Promise(function (resolve, reject) {
        let shareId = wx.getStorageSync("shareUserId");
        return login().then((res) => {
            //登录远程服务器
            console.info("登录远程服务器")
            console.info("shareId:" + shareId)
            console.info("userInfo:" + JSON.stringify(userInfo))
            util.request(api.AuthLoginByWeixin, {
                code: res.code,
                userInfo: userInfo,
                shareId: shareId
            }, 'POST').then(res => {
                if (res.errno === 0) {
                    //存储用户信息
                    wx.setStorageSync('userInfo', res.data.userInfo);
                    wx.setStorageSync('token', res.data.token);

                    resolve(res);
                } else {
                    reject(res);
                }
            }).catch((err) => {
                reject(err);
            });
        }).catch((err) => {
            reject(err);
        })
    });
}

/**
 * 判断用户是否登录
 */
function checkLogin() {
    return new Promise(function (resolve, reject) {
        let userInfo = wx.getStorageSync('userInfo');
        let token = wx.getStorageSync('token');
        if (util.isNotNull(userInfo) && util.isNotNull(token)) {
            checkSession().then(() => {
                resolve(true);
            }).catch(() => {
                reject(false);
            });
        } else {
            reject(false);
        }
    });
}

module.exports = {
    loginByWeixin,
    checkLogin,
};