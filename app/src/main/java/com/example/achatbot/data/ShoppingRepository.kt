package com.example.achatbot.data

import com.example.achatbot.model.ChatMessage
import com.example.achatbot.model.MessageContent
import com.example.achatbot.model.MessageSender
import com.example.achatbot.model.Product
import java.util.UUID

class ShoppingRepository {

    val sampleProducts = listOf(
        Product(
            id = "p1",
            title = "Spigen Rugged Armor Phone Case for iPhone & Samsung Galaxy",
            price = 899.0,
            rating = 4.8f,
            reviewCount = 45200,
            imageUrl = "https://m.media-amazon.com/images/I/714RqwdpBeL._AC_SL1000_.jpg",
            description = "Resilient shock absorption and carbon fiber design for ultimate drop protection and sleek grip.",
            category = "Mobile Accessories",
            badge = "Amazon's Choice"
        ),
        Product(
            id = "p2",
            title = "Liquid Silicone Soft Case with Microfiber Lining & Camera Protection",
            price = 599.0,
            rating = 4.6f,
            reviewCount = 18400,
            imageUrl = "https://m.media-amazon.com/images/I/61vJbuYSkAL._AC_SL1000_.jpg",
            description = "Silky soft-touch finish exterior with shockproof inner microfiber lining to protect your phone.",
            category = "Mobile Accessories",
            badge = "Best Seller"
        ),
        Product(
            id = "p3",
            title = "Anker 20W Fast USB-C Wall Charger Adapter with PowerIQ",
            price = 1299.0,
            rating = 4.9f,
            reviewCount = 67800,
            imageUrl = "https://m.media-amazon.com/images/I/61aG1LzC-TL._AC_SL1000_.jpg",
            description = "High-speed charging for iPhones, Samsung Galaxy, iPads, and other USB-C devices.",
            category = "Mobile Accessories",
            badge = "Top Rated"
        ),
        Product(
            id = "p10",
            title = "Reusable Eco-Friendly Heavy Duty Cotton Grocery Tote Bags (Pack of 3)",
            price = 399.0,
            rating = 4.9f,
            reviewCount = 34200,
            imageUrl = "https://m.media-amazon.com/images/I/71W3fvpuzBL._AC_SL1000_.jpg",
            description = "Durable, washable cotton grocery shopping bags with reinforced stitching and large capacity.",
            category = "Groceries",
            badge = "Eco-Friendly"
        ),
        Product(
            id = "p11",
            title = "Organic Fresh Vegetables Basket & Daily Farm Produce",
            price = 499.0,
            rating = 4.7f,
            reviewCount = 19500,
            imageUrl = "https://m.media-amazon.com/images/I/716Z2d3qK1L._AC_SL1000_.jpg",
            description = "Handpicked farm-fresh seasonal vegetables delivered fresh in a sturdy eco-basket.",
            category = "Groceries",
            badge = "Farm Fresh"
        ),
        Product(
            id = "p12",
            title = "Tata Tea Gold Premium Assam Tea Leaves (500g)",
            price = 340.0,
            rating = 4.8f,
            reviewCount = 82000,
            imageUrl = "https://m.media-amazon.com/images/I/61aG1LzC-TL._AC_SL1000_.jpg",
            description = "Rich aroma and exquisite taste crafted by tea experts for your daily refreshing cup.",
            category = "Groceries",
            badge = "Best Seller"
        ),
        Product(
            id = "p13",
            title = "Cadbury Dairy Milk Silk Chocolate Family Gift Pack",
            price = 450.0,
            rating = 4.9f,
            reviewCount = 112000,
            imageUrl = "https://m.media-amazon.com/images/I/71gbt-v8V-L._AC_SL1000_.jpg",
            description = "Indulge in the smooth, creamy taste of milk chocolate for your sweet cravings and gifting.",
            category = "Groceries",
            badge = "Treats"
        ),
        Product(
            id = "p4",
            title = "Sony WH-1000XM5 Wireless Industry-Leading Noise Canceling Headphones",
            price = 29990.0,
            rating = 4.7f,
            reviewCount = 28400,
            imageUrl = "https://m.media-amazon.com/images/I/61vJbuYSkAL._AC_SL1000_.jpg",
            description = "Crystal clear hands-free calling with 8 microphones and multi-device connection.",
            category = "Audio",
            badge = "Best Seller"
        ),
        Product(
            id = "p5",
            title = "Echo Dot (5th Gen) | Smart speaker with Alexa & vibrant sound",
            price = 4499.0,
            rating = 4.7f,
            reviewCount = 142850,
            imageUrl = "https://m.media-amazon.com/images/I/714RqwdpBeL._AC_SL1000_.jpg",
            description = "Our best sounding Echo Dot yet with vibrant vocals and deep bass.",
            category = "Smart Home",
            badge = "Amazon's Choice"
        ),
        Product(
            id = "p6",
            title = "Apple MacBook Air 15\" Laptop: M3 chip, 8GB RAM, 256GB SSD",
            price = 114900.0,
            rating = 4.8f,
            reviewCount = 4120,
            imageUrl = "https://m.media-amazon.com/images/I/71gbt-v8V-L._AC_SL1000_.jpg",
            description = "Impossibly thin and fast laptop empowering you to get things done anywhere.",
            category = "Laptops",
            badge = "Top Rated"
        ),
        Product(
            id = "p7",
            title = "Instant Pot Duo 7-in-1 Electric Pressure Cooker & Slow Cooker",
            price = 6999.0,
            rating = 4.7f,
            reviewCount = 215000,
            imageUrl = "https://m.media-amazon.com/images/I/71W3fvpuzBL._AC_SL1000_.jpg",
            description = "All-in-one appliance replaces 7 kitchen tools for quick, effortless meals.",
            category = "Kitchen",
            badge = "Best Seller"
        ),
        Product(
            id = "p8",
            title = "American Tourister Casual Laptop Backpack with Water Resistance",
            price = 1499.0,
            rating = 4.6f,
            reviewCount = 31000,
            imageUrl = "https://m.media-amazon.com/images/I/716Z2d3qK1L._AC_SL1000_.jpg",
            description = "Spacious compartments, padded shoulder straps, and durable water-resistant fabric.",
            category = "Travel",
            badge = "Deal of the Day"
        ),
        Product(
            id = "p9",
            title = "JBL Flip 6 Waterproof Portable Bluetooth Speaker",
            price = 9999.0,
            rating = 4.8f,
            reviewCount = 52400,
            imageUrl = "https://m.media-amazon.com/images/I/714RqwdpBeL._AC_SL1000_.jpg",
            description = "Bold sound, IP67 waterproof and dustproof rating with 12 hours of playtime.",
            category = "Audio",
            badge = "Amazon's Choice"
        )
    )

    fun getInitialGreeting(): ChatMessage {
        return ChatMessage(
            id = UUID.randomUUID().toString(),
            sender = MessageSender.BOT,
            content = MessageContent.Text(
                "Hello! I'm your AI Shopping Assistant. How can I help you find products, check order status, or explore deals today?"
            )
        )
    }

    fun generateBotResponse(query: String): List<ChatMessage> {
        val q = query.lowercase().trim()
        val responseList = mutableListOf<ChatMessage>()

        when {
            q == "hi" || q == "hello" || q == "hey" || q.contains("good morning") || q.contains("good afternoon") -> {
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Hello! I'm your AI Shopping Assistant. How can I help you discover great products, check order status, or find today's best deals?")
                    )
                )
            }
            q.contains("thank") || q.contains("thanks") -> {
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("You're very welcome! Let me know if you need assistance with anything else.")
                    )
                )
            }
            q.contains("grocery") || q.contains("groceries") || q.contains("bag") || q.contains("bags") || q.contains("vegetable") || q.contains("food") || q.contains("snack") || q.contains("tea") || q.contains("chocolate") -> {
                val matches = sampleProducts.filter { it.category == "Groceries" || it.title.lowercase().contains(q) || it.description.lowercase().contains(q) }
                val displayList = if (matches.isNotEmpty()) matches else sampleProducts.filter { it.category == "Groceries" }
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Here are fresh groceries, reusable shopping bags, and daily essentials matching your request:")
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.ProductRecommendations("Groceries & Bags", displayList)
                    )
                )
            }
            q.contains("case") || q.contains("cover") || q.contains("phone") || q.contains("charger") || q.contains("cable") -> {
                val matches = sampleProducts.filter { it.category == "Mobile Accessories" || it.title.lowercase().contains(q) || it.description.lowercase().contains(q) }
                val displayList = if (matches.isNotEmpty()) matches else sampleProducts.filter { it.category == "Mobile Accessories" }
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Here are the best phone cases, covers, and mobile accessories matching your request:")
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.ProductRecommendations("Mobile Accessories & Cases", displayList)
                    )
                )
            }
            q.contains("headphone") || q.contains("audio") || q.contains("sound") || q.contains("sony") || q.contains("speaker") -> {
                val matches = sampleProducts.filter { it.category == "Audio" }
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Here are top-rated headphones and portable speakers with premium sound quality:")
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.ProductRecommendations("Top Audio Picks", matches)
                    )
                )
            }
            q.contains("laptop") || q.contains("macbook") || q.contains("computer") || q.contains("apple") -> {
                val matches = sampleProducts.filter { it.category == "Laptops" }
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Here is our latest high-performance laptop matching your needs:")
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.ProductRecommendations("Recommended Laptops", matches)
                    )
                )
            }
            q.contains("gift") || q.contains("best") || q.contains("popular") || q.contains("deal") || q.contains("trending") -> {
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Here are some of our most popular customer favorites and top-rated items right now:")
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.ProductRecommendations("Trending Best Sellers", sampleProducts.take(4))
                    )
                )
            }
            q.contains("order") || q.contains("tracking") || q.contains("delivery") || q.contains("package") -> {
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.OrderStatus(
                            orderId = "AMZ-8849201",
                            status = "Out for Delivery",
                            deliveryDate = "Today by 7:00 PM",
                            itemName = "Reusable Cotton Grocery Tote Bags"
                        )
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Your package is currently out for delivery with our local courier. Would you like to update delivery instructions?")
                    )
                )
            }
            q.contains("kitchen") || q.contains("cook") || q.contains("home") || q.contains("pot") -> {
                val matches = sampleProducts.filter { it.category == "Kitchen" || it.category == "Smart Home" }
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.Text("Here are top-rated smart home and kitchen appliances loved by shoppers:")
                    )
                )
                responseList.add(
                    ChatMessage(
                        UUID.randomUUID().toString(),
                        MessageSender.BOT,
                        MessageContent.ProductRecommendations("Home & Kitchen Favorites", matches)
                    )
                )
            }
            else -> {
                val matches = sampleProducts.filter { 
                    it.title.lowercase().contains(q) || it.description.lowercase().contains(q) || it.category.lowercase().contains(q)
                }
                if (matches.isNotEmpty()) {
                    responseList.add(
                        ChatMessage(
                            UUID.randomUUID().toString(),
                            MessageSender.BOT,
                            MessageContent.Text("I found these items matching \"$query\":")
                        )
                    )
                    responseList.add(
                        ChatMessage(
                            UUID.randomUUID().toString(),
                            MessageSender.BOT,
                            MessageContent.ProductRecommendations("Search Results", matches)
                        )
                    )
                } else {
                    responseList.add(
                        ChatMessage(
                            UUID.randomUUID().toString(),
                            MessageSender.BOT,
                            MessageContent.Text("I couldn't find an exact match for \"$query\". Please choose from the topics below or select what you are looking for:")
                        )
                    )
                    responseList.add(
                        ChatMessage(
                            UUID.randomUUID().toString(),
                            MessageSender.BOT,
                            MessageContent.QuickOptions(
                                "Suggested Topics & Categories",
                                listOf(
                                    "🛒 Groceries & Bags",
                                    "📱 Mobile Accessories & Cases",
                                    "🎧 Audio & Headphones",
                                    "💻 Laptops & Computers",
                                    "🍳 Home & Kitchen",
                                    "📦 Track My Order"
                                )
                            )
                        )
                    )
                }
            }
        }
        return responseList
    }
}
