package com.swasi.jetpackcompose.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*

class SliderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SliderExample()
        }
    }
    @Composable
    fun SliderExample() {
        var slider by remember { mutableStateOf(0f) }
        var sliderPosition by remember { mutableStateOf(0f) }
        Text(text = slider.toString())
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
    }
}