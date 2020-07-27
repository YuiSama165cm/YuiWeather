package com.yui.yuiweather.logic.network

import com.yui.yuiweather.YuiWeatherApplication
import com.yui.yuiweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${YuiWeatherApplication.TOKEN}&lang=zh_CN")

    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}