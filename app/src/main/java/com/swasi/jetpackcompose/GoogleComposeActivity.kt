package com.swasi.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp

class GoogleComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            PreviewMessageCard("Hello Sibaprasad")
//            MessageCardWithMultipleTextColumnWise(User("Sibaprasad", "Mohanty"))
//            MessageCardWithImage("Sibaprasad", "Mohanty")
            MessageCardWithCustomImageAndText("Sibaprasad", "Mohanty")
        }
    }
}

@Composable
fun MessageCard(message : String){
    Text(text = message)
}

@Preview
@Composable
fun PreviewMessageCard( @PreviewParameter(SampleUserProvider::class) message: String){
    MessageCard(message)
}

class SampleUserProvider: PreviewParameterProvider<String> {
    override val values = sequenceOf("Name")
}


class MessageWithMultipleTextProvider : PreviewParameterProvider<User> {
    override val values = sequenceOf(User("Siba", "Mohanty"), User("Siba", "Mohanty"))
}

//@Preview
@Composable
fun MessageCardWithMultipleTextColumnWise(/*@PreviewParameter(MessageWithMultipleTextProvider::class)*/ user: User) {
    Column() {
        MultipleTextColumn(user = user)
        MultipleTextRow(user = user)
    }
}

data class User(val fname: String, val lastName: String)

@Composable
fun MultipleTextColumn(user: User) {
    Column {
        Text(text = user.fname)
        Text(text = user.lastName)
    }
}

@Composable
fun MultipleTextRow(user: User) {
    Row() {
        Text(text = user.fname)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = user.lastName)
    }
}


@Composable
fun MessageCardWithImage(msg1: String, msg2:String) {
    Row {
        Image(
            painter = painterResource(R.drawable.my_photograph),
            contentDescription = "Contact profile picture",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))
                .size(250.dp,150.dp)
        )

        /*modifier = Modifier
            .clip(shape = RoundedCornerShape(16.dp))
            .fillMaxHeight()
            .width(75.dp)*/

        Column {
            Text(text = msg1)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = msg2)
        }
    }
}

@Composable
fun MessageCardWithCustomImageAndText(name: String, addrs : String) {
    // Add padding around our message
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.my_photograph),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = name)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = addrs)
        }
    }
}
