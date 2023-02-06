package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message = getString(R.string.bday_wish_message), from = getString(
                                            R.string.card_from_person))
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(id = R.drawable.bday)

    Box {
        Image(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            painter = image,
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = message, from = "-from $from")
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {

    Column {

        Text(modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(5.dp), text = message, fontSize = 36.sp)

        Text(modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(5.dp),
            text = from
        )
    }
}

//@Preview(showBackground = true, showSystemUi = false, name="Bday")
@Composable
fun BirthdayGreeetingWithTextPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Sam", from = "-Emma")
    }
}

@Preview(showBackground = true, showSystemUi = false, name="Bday")
@Composable
fun BirthdayGreetingWithImagePreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(message = stringResource(R.string.bday_wish_message), from = stringResource(R.string.card_from_person)
        )
    }
}