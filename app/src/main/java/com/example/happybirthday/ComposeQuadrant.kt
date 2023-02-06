package com.example.happybirthday

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeQuadrant : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box {
                        Quadrant()
                    }
                }
            }
        }
    }
}

@Composable
fun Quadrant()
{
    Column(modifier = Modifier.background(Color.Green)
        .size(LocalConfiguration.current.screenWidthDp.dp/2,LocalConfiguration.current.screenHeightDp.dp/2),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

        Text("Hello 1", textAlign = TextAlign.Center)
    }
    Row(modifier = Modifier.background(Color.Yellow)
        .size(LocalConfiguration.current.screenWidthDp.dp/2,LocalConfiguration.current.screenHeightDp.dp/2),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {

        Text("Hello 2", textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun Main()
{
    HappyBirthdayTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Box {
                Quadrant()
            }
        }
    }
}