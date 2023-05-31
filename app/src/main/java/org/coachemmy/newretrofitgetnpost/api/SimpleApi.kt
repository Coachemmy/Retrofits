package org.coachemmy.newretrofitgetnpost.api

import org.coachemmy.newretrofitgetnpost.model.Post
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface SimpleApi {

/*
    @GET("posts/1")
    suspend fun getPost(
    ): Post


    @POST("posts")
    suspend fun pushPost(
        @Body post: Post
    ): Response<Post>
*/

    @FormUrlEncoded
    @POST("posts")
    suspend fun pushPost3(
        @Field("userId") userId: Int,
        @Field("id") Id: Int,
        @Field("title") title: String,
        @Field("body") body: String
    ): Response<Post>
}