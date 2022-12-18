package com.fatih_android.githubapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fatih_android.githubapp.R
import com.fatih_android.githubapp.constant.Const
import com.fatih_android.githubapp.data.GithubUser
import com.fatih_android.githubapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setContentView(binding.root)

        val dataGithubUser = intent.getParcelableExtra<GithubUser>(Const.GITHUB_DATA) as GithubUser

        binding.apply {
            imgProfile.setImageResource(dataGithubUser.avatar ?: R.drawable.user1)
            tvUserGithub.text = dataGithubUser.username
            tvNameUser.text = dataGithubUser.name
            tvNumberFollower.text = dataGithubUser.followers
            tvNumberFollowing.text = dataGithubUser.following
            tvNumberRepository.text = dataGithubUser.repository
            tvCompanyPeople.text = dataGithubUser.company
            tvLocationPeople.text = dataGithubUser.location
        }
    }
}