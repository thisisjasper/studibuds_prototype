package com.jasperzj.studibuds.card

data class CardData(
    val id: Long = counter++,
    val handle: String,
    val description: String,
    val nickname: String,
    val url: String
) {
    companion object {
        private var counter = 0L
    }
}