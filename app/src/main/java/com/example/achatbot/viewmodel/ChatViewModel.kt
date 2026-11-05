package com.example.achatbot.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.achatbot.data.ShoppingRepository
import com.example.achatbot.model.ChatMessage
import com.example.achatbot.model.MessageContent
import com.example.achatbot.model.MessageSender
import com.example.achatbot.model.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.UUID

class ChatViewModel : ViewModel() {
    private val repository = ShoppingRepository()

    private val _messages = MutableStateFlow<List<ChatMessage>>(listOf(repository.getInitialGreeting()))
    val messages: StateFlow<List<ChatMessage>> = _messages.asStateFlow()

    private val _isTyping = MutableStateFlow(false)
    val isTyping: StateFlow<Boolean> = _isTyping.asStateFlow()

    private val _cartItems = MutableStateFlow<List<Product>>(emptyList())
    val cartItems: StateFlow<List<Product>> = _cartItems.asStateFlow()

    private val _selectedProductForDetail = MutableStateFlow<Product?>(null)
    val selectedProductForDetail: StateFlow<Product?> = _selectedProductForDetail.asStateFlow()

    fun sendMessage(text: String) {
        if (text.isBlank()) return

        val userMsg = ChatMessage(
            id = UUID.randomUUID().toString(),
            sender = MessageSender.USER,
            content = MessageContent.Text(text)
        )

        _messages.value = _messages.value + userMsg
        _isTyping.value = true

        viewModelScope.launch {
            delay(1200) // Simulate AI thinking time
            val botResponses = repository.generateBotResponse(text)
            _isTyping.value = false
            _messages.value = _messages.value + botResponses
        }
    }

    fun addToCart(product: Product) {
        if (!_cartItems.value.contains(product)) {
            _cartItems.value = _cartItems.value + product
        }
        val confirmationMsg = ChatMessage(
            id = UUID.randomUUID().toString(),
            sender = MessageSender.BOT,
            content = MessageContent.Text("Added \"${product.title}\" to your cart! You now have ${_cartItems.value.size} item(s) in your cart.")
        )
        _messages.value = _messages.value + confirmationMsg
    }

    fun selectProduct(product: Product?) {
        _selectedProductForDetail.value = product
    }
}
