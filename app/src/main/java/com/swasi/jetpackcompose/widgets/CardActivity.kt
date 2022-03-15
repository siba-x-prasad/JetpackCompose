package com.swasi.jetpackcompose.widgets

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardDemo()
        }
    }


    @Composable
    fun CardDemo() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        append("welcome to ")
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.W900,
                                color = Color(0xFF4552B8)
                            )
                        ) {
                            append("Jetpack Compose Playground")
                        }
                    }
                )
                Text(
                    buildAnnotatedString {
                        append("Now you are in the ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.W900)) {
                            append("Card")
                        }
                        append(" section")
                    }
                )
            }
        }
    }
}