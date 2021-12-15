package com.example.clientapp.models

import android.graphics.drawable.Drawable
import androidx.room.Entity
import androidx.room.PrimaryKey

data class ClientService (
//    var sizeLong: Long,
    var title: String? = null,
    var money: String? = null,
    var time: String? = null,
    var image: Drawable? = null,
//    var image: String= "",

    var expandable: Boolean = false,
//    var path: String? = null,
//    var toDelete: Boolean = false,
    val id: Int? = null
)
data class TopicClientService (
    val title:  String,
    val listAppGarbage: MutableList<ClientService>
)