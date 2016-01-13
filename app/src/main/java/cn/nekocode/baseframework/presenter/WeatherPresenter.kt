package cn.nekocode.baseframework.presenter

import cn.nekocode.baseframework.data.dto.Weather
import cn.nekocode.baseframework.data.module.WeatherModule
import cn.nekocode.baseframework.data.service.Net
import cn.nekocode.baseframework.presenter.helper.Presenter
import cn.nekocode.baseframework.utils.onUI

/**
 * Created by nekocode on 2015/11/20.
 */
class WeatherPresenter(val impl: WeatherPresenter.ViewInterface): Presenter {
    interface ViewInterface {
        fun setWeatherInfo(weather: Weather)
    }

    fun created() {
        WeatherModule.getWeather("101010100").onUI().subscribe {
            impl.setWeatherInfo(it)
        }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destory() {
    }


}