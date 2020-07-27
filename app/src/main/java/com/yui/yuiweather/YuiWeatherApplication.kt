package com.yui.yuiweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class YuiWeatherApplication:Application(){

    companion object{
        const val TOKEN = "hKzSEjkOhEojvfgG"//彩云申请的令牌
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}