package com.weitian.wanapp.ui.homePage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weitian.wanapp.network.HomePageApi
import com.weitian.wanapp.network.HomePageData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePageViewModel :ViewModel(){
    private val _response=MutableLiveData<String>()
    val response:LiveData<String> get()=_response

    init {
        getHomePageData()
    }

    private fun getHomePageData() {
        HomePageApi.retrofitService.getArticles().enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>?, response: Response<String>?) {
                _response.value=
                    "Success: ${response?.body()} "
            }

            override fun onFailure(call: Call<String>?, t: Throwable?) {
                _response.value="Failure"
            }
        })
    }

}