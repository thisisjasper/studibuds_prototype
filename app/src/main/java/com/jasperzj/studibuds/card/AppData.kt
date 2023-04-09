package com.jasperzj.studibuds.card

import android.net.Uri

object AppData {
    var discordTag: String = ""
    var nickname: String = ""
    var description: String = ""
    var imageUri: Uri? = null
    val carddatas: List<CardData> = listOf(
        CardData(
            nickname = "Yeet",
            url = "https://source.unsplash.com/Xq1ntWruZQI/600x800",
            handle = "jzj",
            description = "Hello! I love it here."
        )
    )
}