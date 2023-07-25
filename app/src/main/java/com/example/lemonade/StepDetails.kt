package com.example.lemonade

data class StepDetails(
    val imageResourceId: Int,
    val stringResourceId: Int,
    val imageContent: Int,
    var tapCount: Int = 1
)