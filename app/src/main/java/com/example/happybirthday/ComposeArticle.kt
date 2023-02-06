package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeArticle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        HeaderImage()
                        HeaderText(name = getString(R.string.composeArticleHeader))
                        IntroText(intro = getString(R.string.composeArticleIntro))
                        TextBody(body = getString(R.string.composeArticleBody))
                    }
                }
            }
        }
    }
}

@Composable
fun TextBody(body: String)
{
    Text(text = body,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}
@Composable
fun IntroText(intro:String)
{
    Text(text = intro,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun HeaderText(name: String)
{
    Text(text = name,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
        )
}

@Composable
fun HeaderImage()
{
    Image(painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = "Header Image",
        modifier = Modifier.fillMaxWidth()

    )
}

@Preview(showBackground = true)
@Composable
fun HeaderImagePreview()
{
    HappyBirthdayTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(){
                HeaderImage()
                HeaderText(name = stringResource(R.string.composeArticleHeader))
                IntroText(intro = stringResource(R.string.composeArticleIntro))
                TextBody(body = stringResource(R.string.composeArticleBody))

            }
        }
}
}
