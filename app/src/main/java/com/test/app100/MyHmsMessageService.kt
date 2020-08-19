package com.test.app100

import android.util.Log
import com.huawei.hms.push.HmsMessageService
import com.huawei.hms.push.RemoteMessage

class MyHmsMessageService : HmsMessageService() {
    override fun onNewToken(token: String) {
        Log.e("HCM Refresh Token", "Refreshed token: $token")
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)
        Log.e("HCM Remote Message", "Remote Mesage: ${remoteMessage?.data.toString()}")
    }
}