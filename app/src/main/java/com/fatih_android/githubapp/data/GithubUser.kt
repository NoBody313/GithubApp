package com.fatih_android.githubapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class GithubUser(
    val username: String?,
    val name: String?,
    val location: String?,
    val repository: String?,
    val company: String?,
    val followers: String?,
    val following: String?,
    val avatar: Int?
) : Parcelable