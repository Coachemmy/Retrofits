package org.coachemmy.newretrofitgetnpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.coachemmy.newretrofitgetnpost.model.Post
import org.coachemmy.newretrofitgetnpost.repository.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
        val repository= Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Response", response.userId.toString())
            Log.d("Response", response.id.toString())
            Log.d("Response", response.title)
            Log.d("Response", response.body)
        })

        val repository= Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        val myPost = Post(2, 33, "Coach Emmy", "retrofit post practice")
        viewModel.pushPost(myPost)
        viewModel.myResponse2.observe(this, Observer { response ->
           if (response.isSuccessful){
               Log.d("Main", response.body().toString())
               Log.d("Main", response.code().toString())
               Log.d("Main", response.message())
           }else{
               Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()

           }
        })
 */

        val repository= Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        viewModel.pushPost3(2, 33, "Coach Emmy", "retrofit post practice")
        viewModel.myResponse2.observe(this, Observer { response ->
            if (response.isSuccessful){
                Log.d("Main", response.body().toString())
                Log.d("Main", response.code().toString())
                Log.d("Main", response.message())
            }else{
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()

            }
        })

    }
}