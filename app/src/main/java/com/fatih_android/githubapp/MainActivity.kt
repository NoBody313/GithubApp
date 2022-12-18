package com.fatih_android.githubapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.fatih_android.githubapp.adapter.ListAdapter
import com.fatih_android.githubapp.data.DataGithubUser
import com.fatih_android.githubapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()

        binding.rvListPeople.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ListAdapter(DataGithubUser.listDataGithubUser)
        }
        setContentView(binding.root)
    }
}