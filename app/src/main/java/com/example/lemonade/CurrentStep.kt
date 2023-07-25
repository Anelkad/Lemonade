package com.example.lemonade

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import com.example.lemonade.ui.theme.StepDetails

object CurrentStep {
    private val _id = mutableStateOf(1)
    val id: Int by _id

    private val _value = mutableStateOf(Steps.values[id] ?: StepDetails(R.drawable.lemon_tree, R.string.tap_lemon_tree, R.string.lemon_tree))
    val value: StepDetails by _value

    fun nextStep() {
        val tapCount = Steps.values[id]?.tapCount ?: 1
        if (tapCount > 1) {
            Steps.values[id]?.tapCount = tapCount - 1
        } else {
            if (id == 4) {
                Steps.generateNewValues()
                _id.value = 1
                _value.value = Steps.values[id] ?: StepDetails(R.drawable.lemon_tree, R.string.tap_lemon_tree, R.string.lemon_tree)
            } else {
                _id.value = id + 1
                _value.value = Steps.values[id] ?: StepDetails(R.drawable.lemon_tree, R.string.tap_lemon_tree, R.string.lemon_tree)
            }
        }
    }
}
