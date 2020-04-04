var util = require('../../../utils/util.js');
var api = require('../../../config/api.js');
var user = require('../../../utils/user.js');
var app = getApp();

Page({
    data: {
        aboutShow: true,
        userInfo: {
            nickName: '请登录',
            avatarUrl: 'http://yanxuan.nosdn.127.net/8945ae63d940cc42406c3f67019c5cb6.png'
        },
        notice_info: '',
        money: 0
    },
    onLoad: function (options) {
        let that = this;
        util.request(api.userMoney).then(function (res) {
            that.setData({
                money: res.data.money
            })
        });
    },
    onReady: function () {

    },
    onShow: function () {
        let userInfo = wx.getStorageSync('userInfo');
        this.setData({
            aboutShow: true,
            userInfo: userInfo,
        });

    },
    onHide: function () {
        // 页面隐藏

    },
    onUnload: function () {
        // 页面关闭
    },

    goOrder() {
        wx.navigateTo({
            url: "/pages/auth/login/login"
        });
    },
    goCoupon() {
        wx.navigateTo({
            url: "/pages/ucenter/coupon/coupon"
        });

    },
    goGroupon() {
        wx.navigateTo({
            url: "/pages/groupon/myGroupon/myGroupon"
        });
    },
    goCollect() {
        wx.navigateTo({
            url: "/pages/ucenter/collect/collect"
        });
    },
    goFootprint() {
        wx.navigateTo({
            url: "/pages/ucenter/footprint/footprint"
        });
    },
    goAddress() {
        wx.navigateTo({
            url: "/pages/ucenter/address/address"
        });
    },

    goUserMoney() {
        wx.navigateTo({
            url: "/pages/userMoney/userMoney?onlyCommission=" + false
        });
    },

    goUserFriend() {
        wx.navigateTo({
            url: "/pages/userFriend/userFriend"
        });
    },
    goMyCar() {
        wx.navigateTo({
            url: "/pages/cart/cart"
        });
    },
    exitLogin: function () {
        wx.showModal({
            title: '',
            confirmColor: '#b4282d',
            content: '退出登录？',
            success: function (res) {
                if (res.confirm) {
                    wx.removeStorageSync('token');
                    wx.removeStorageSync('userInfo');
                    wx.switchTab({
                        url: '/pages/index/index'
                    });
                }
            }
        })
    },
})