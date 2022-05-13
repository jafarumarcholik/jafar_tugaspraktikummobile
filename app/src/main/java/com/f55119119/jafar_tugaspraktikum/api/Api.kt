package com.f55119119.jafar_tugaspraktikum.api

import com.f55119119.jafar_tugaspraktikum.data.model.DetailUser
import com.f55119119.jafar_tugaspraktikum.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users" )
    @Headers( "Authorization: token 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" )

    fun getSearchUsers (
        @Query ( "q" ) query : String
    ): Call<UserResponse>

    @GET( "users/{username}" )
    @Headers( "Authorization: token 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" )

    fun getUserDetail (
        @Path ( "username" ) username : String
    ): Call<DetailUser>
}