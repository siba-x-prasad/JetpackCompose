package com.swasi.jetpackcompose.widgets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.compose.material.OutlinedButton
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import com.swasi.jetpackcompose.R
import androidx.compose.ui.res.painterResource
class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonExample()
        }
    }

    @Composable
    fun showSimpleButton(){
        Button(
            onClick = {},
            modifier = Modifier.padding(8.dp),
//            elevation = ButtonConstants.defaultElevation(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Simple Button")
        }
    }

    @Composable
    fun ButtonExample() {
        Button(onClick = {}, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.White
        )) {
            Text("Button")
        }
    }

    @Composable
    fun ButtonExample1() {
        Button(
            onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
                containerColor = Color.Red
            )
        ) {
            Text("Button")
        }
    }

    @Composable
    fun OutlinedButtonExample() {
        OutlinedButton(onClick = { /* Do something! */ }) {
            Text("I'm an Outlined Button")
        }
    }

    @Composable
    fun TextButtonExample() {
        TextButton(onClick = { /* Do something! */ }) {
            Text("I'm a Text Button")
        }
    }

    @Composable
    fun MainContent(){
        Column(
            Modifier
                .background(Color(0xFFFFFFFF))
                .fillMaxSize()
                .padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Button(
                onClick = {
                    // do something here
                },
                shape = RoundedCornerShape(8.dp)/*,
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 6.dp,
                    pressedElevation = 8.dp,
                    disabledElevation = 0.dp
                )*/
            ) {
                Text(
                    text = "Elevation 6 DP",
                    modifier = Modifier.padding(12.dp)
                )
            }

            Button(
                onClick = {
                    // do something here
                },
                shape = RoundedCornerShape(8.dp)/*,
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 6.dp,
                    pressedElevation = 8.dp,
                    disabledElevation = 0.dp
                )*/,
                enabled = false
            ) {
                Text(
                    text = "Disabled Elevation 0 DP",
                    modifier = Modifier.padding(12.dp)
                )
            }

            TextButton(
                onClick = {
                    // do something here
                },
                shape = RoundedCornerShape(8.dp)/*,
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    disabledElevation = 0.dp
                )*/,
                enabled = true
            ) {
                Text(
                    text = "Elevation 1 DP",
                    modifier = Modifier.padding(12.dp)
                )
            }

            OutlinedButton(
                onClick = {
                    // do something here
                },
                shape = CircleShape/*,
                elevation = ButtonDefaults.ButtonDefaults.buttonElevation()*/

            ) {
                Text(
                    text = "Elevation 8 DP",
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
    @Composable
    fun showSimpleButtonWithImage(){
        Button(
            onClick = {},
            modifier = Modifier.padding(8.dp),
//            elevation = ButtonConstants.defaultElevation(),
            shape = RoundedCornerShape(15.dp),
        ) {
            Row{
                Icon(Icons.Filled.Menu, "menu")
//                Icon(asset = painterResource(R.drawable.my_photograph), modifier = Modifier.padding(end = 4.dp))
                Text(text = "Simple Button")
            }
        }
    }
}