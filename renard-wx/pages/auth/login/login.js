var api = require('../../../config/api.js');
var util = require('../../../utils/util.js');
var user = require('../../../utils/user.js');

var app = getApp();
Page({
    data: {
        shareId: 0
    },
    onLoad: function (options) {

    },
    wxLogin: function (e) {
        if (e.detail.userInfo == undefined) {
            util.showErrorToast('微信登录失败');
            return;
        }
        user.checkLogin().catch(() => {
            user.loginByWeixin(e.detail.userInfo).then(res => {
                wx.navigateBack({
                    delta: 1
                })
            }).catch((err) => {
                util.showErrorToast('微信登录失败');
            });
        });
    }
})