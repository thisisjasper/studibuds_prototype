package com.jasperzj.studibuds.card

import android.net.Uri

object AppData {
    var discordTag: String = ""
    var nickname: String = ""
    var description: String = ""
    var imageUri: Uri? = null
    val carddatas: List<CardData> = listOf(
        CardData(
            nickname = "Billy",
            url = "https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/113511/-KID-LUFFY-Monkey-D-Luffy-One-Piece-anime-Mindless-iphone-8-wallpaper-ilikewallpaper_com_750.jpg",
            handle = "billy#1936",
            description = "What's up.\nIf you like computer science too,\nWe should work together!."
        ),
        CardData(
            nickname = "Rudy",
            url = "https://w0.peakpx.com/wallpaper/884/18/HD-wallpaper-joker-emoji-joker-emoji-funny-clown.jpg",
            handle = "edgyedgy#4882",
            description = "If your smart, work with me. If not, swipe left."
        ),
        CardData(
            nickname = "Fischer",
            url = "https://e0.pxfuel.com/wallpapers/637/167/desktop-wallpaper-black-chess-king-finial-glass-crown-thumbnail.jpg",
            handle = "chess4life#9420",
            description = "I\nLUV\nCHESS. We can program and play chess :D"
        ),
        CardData(
            nickname = "Woz",
            url = "https://images.unsplash.com/flagged/photo-1572392640988-ba48d1a74457?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8&w=1000&q=80",
            handle = "stevieW#1128",
            description = "Join me on a journey to learn further."
        ),
        CardData(
            nickname = "Scalumpscious Sam",
            url = "https://w0.peakpx.com/wallpaper/994/46/HD-wallpaper-troll-amoled-troll-face.jpg",
            handle = "genuineguy#3829",
            description = "a\nmo\ng\nus"
        )
    )
}