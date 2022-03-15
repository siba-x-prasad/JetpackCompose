package com.swasi.jetpackcompose.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch

class DrawerLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModalDrawerLayoutSample()
        }
    }
    @Composable
    fun ModalDrawerLayoutSample() {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        ModalDrawer(
            drawerState = drawerState,
            drawerContent = {
                Column {
                    Text("Text in Drawer")
                    Button(onClick = {
                        scope.launch {
                            drawerState.close()
                        }
                    }) {
                        Text("Close Drawer")
                    }
                }
            },
            content = {
                Column {
                    Text("Text in Bodycontext")
                    Button(onClick = {

                        scope.launch {
                            drawerState.open()
                        }

                    }) {
                        Text("Click to open")
                    }
                }
            }
        )
    }
}