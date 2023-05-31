package org.coachemmy.newretrofitgetnpost.repository

import org.coachemmy.newretrofitgetnpost.api.RetrofitInstance
import org.coachemmy.newretrofitgetnpost.model.Post
import retrofit2.Response

class Repository {

/*
    suspend fun getPost():Post{
        return RetrofitInstance.api.getPost()
    }


    suspend fun pushPost(post: Post): Response<Post>{
        return RetrofitInstance.api.pushPost(post)
    }
*/

    suspend fun pushPost3(userId: Int, id: Int, title: String, body: String): Response<Post>{
        return RetrofitInstance.api.pushPost3(userId, id, title, body)
    }
}