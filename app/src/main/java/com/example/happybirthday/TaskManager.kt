package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class TaskManager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally)  {
                        ShowImage()
                        ShowText()
                    }
                }
            }
        }
    }
}

@Composable
fun ShowText()
{
    Text(modifier = Modifier.padding(top=24.dp, bottom = 8.dp), text = "All Tasks Completed", fontWeight = FontWeight.Bold)
    Text(fontSize = (16.sp),text = "Nice Work!")
}
@Composable
fun ShowImage()
{
    Image(painter = painterResource(id = R.drawable.ic_task_completed),
        contentDescription = "Task Completed",
        modifier = Modifier
//            .padding(start = 70.dp, end = 70.dp),


    )
}
@Composable
@Preview(showBackground = true)
fun ShowMain()
{
    HappyBirthdayTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                ShowImage()
                ShowText()
            }
        }
    }
}
