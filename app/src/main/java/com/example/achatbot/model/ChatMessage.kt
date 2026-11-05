package com.example.achatbot.model

enum class MessageSender {
    USER,
    BOT
}

sealed interface MessageContent {
    data class Text(val text: String) : MessageContent
    data class ProductRecommendations(val heading: String, val products: List<Product>) : MessageContent
    data class OrderStatus(val orderId: String, val status: String, val deliveryDate: String, val itemName: String) : MessageContent
    data class QuickOptions(val heading: String, val options: List<String>) : MessageContent
}

data class ChatMessage(
    val id: String,
    val sender: MessageSender,
    val content: MessageContent,
    val timestamp: Long = System.currentTimeMillis()
)
