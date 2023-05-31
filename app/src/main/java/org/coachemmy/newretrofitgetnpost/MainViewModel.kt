package org.coachemmy.newretrofitgetnpost

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.coachemmy.newretrofitgetnpost.model.Post
import org.coachemmy.newretrofitgetnpost.repository.Repository
import retrofit2.Response

class MainViewModel(private val repository: Repository ) : ViewModel() {

    val myResponse2: MutableLiveData<Response<Post>> = MutableLiveData()

/*
    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response:Post = repository.getPost()
            myResponse.value = response

        }
    }


    fun pushPost(post: Post){
        viewModelScope.launch {
            val response:Response<Post> = repository.pushPost(post)
            myResponse2.value = response
        }
    }
 */

    fun pushPost3(userId: Int, id: Int, title: String, body: String){
        viewModelScope.launch {
            val response:Response<Post> = repository.pushPost3(userId, id, title, body)
            myResponse2.value = response
        }
    }
}
