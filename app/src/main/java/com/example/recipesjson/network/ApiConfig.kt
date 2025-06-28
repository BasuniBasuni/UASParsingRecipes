package com.example.recipesjson.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object ApiConfig {
    fun getApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}


/*
class ApiConfig {
    companion object {
        private const val BASE_URL = "https://dummyjson.com/"

        @Volatile
        private var INSTANCE: ApiConfig? = null

        fun getInstance(): ApiConfig {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: ApiConfig().also { INSTANCE = it }
            }
        }
    }

    private var retrofit: Retrofit? = null

    init {
        setupRetrofit()
    }

    private fun setupRetrofit() {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(getLoggingInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    fun getApiService(): ApiService {
        return retrofit?.create(ApiService::class.java)
            ?: throw IllegalStateException("Retrofit not initialized")
    }

    // Method untuk mengubah base URL jika diperlukan
    fun updateBaseUrl(newBaseUrl: String) {
        retrofit = Retrofit.Builder()
            .baseUrl(newBaseUrl)
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}*/
