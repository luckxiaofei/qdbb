var util = require('./utils/util.js');
var api = require('./config/api.js');
var user = require('./utils/user.js');

App({
    globalData: {
        hasLogin: false
    },
    onLaunch: function () {
        const updateManager = wx.getUpdateManager();
        wx.getUpdateManager().onUpdateReady(function () {
            wx.showModal({
                title: '更新提示',
                content: '新版本已经准备好，是否重启应用？',
                success: function (res) {
                    if (res.confirm) {
                        // 新的版本已经下载好，调用 applyUpdate 应用新版本并重启
                        updateManager.applyUpdate()
                    }
                }
            })
        })
    },
    onShow: function (options) {
        //避免登录页面多次跳转
        let index = options.path.indexOf("login");
        if (index > 0) {
            return;
        }
        //判断是否登录
        user.checkLogin().then(res => {
            console.info("已登录")
        }).catch(() => {
            wx.navigateTo({
                url: "/pages/auth/login/login"
            });
        });
    },
})