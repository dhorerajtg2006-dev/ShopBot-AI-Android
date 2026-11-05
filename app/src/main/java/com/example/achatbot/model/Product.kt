package com.example.achatbot.model

data class Product(
    val id: String,
    val title: String,
    val price: Double,
    val rating: Float,
    val reviewCount: Int,
    val imageUrl: String,
    val description: String,
    val category: String,
    val badge: String? = null // e.g., "Amazon's Choice", "Best Seller"
)
