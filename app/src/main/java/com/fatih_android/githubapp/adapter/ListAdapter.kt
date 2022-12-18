package com.fatih_android.githubapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fatih_android.githubapp.ui.detail.DetailActivity
import com.fatih_android.githubapp.R
import com.fatih_android.githubapp.constant.Const
import com.fatih_android.githubapp.data.GithubUser
import com.fatih_android.githubapp.databinding.ListItemPeopleBinding

class ListAdapter(private val listGithubUser: ArrayList<GithubUser>) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(val binding: ListItemPeopleBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListViewHolder(
        ListItemPeopleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val githubUser = listGithubUser[position]

        holder.binding.apply {
            imgProfile.setImageResource(githubUser.avatar ?: R.drawable.user1)
            tvUsernamePeople.text = githubUser.username
            tvCompanyPeople.text = githubUser.company
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(Const.GITHUB_DATA, listGithubUser[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listGithubUser.size
    }
}