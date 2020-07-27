package com.yui.yuiweather.logic.model

import com.google.gson.annotations.SerializedName


data  class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val remperature:Float,
                        @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val api: AQI)

    data class AQI(val chn: Float)
}