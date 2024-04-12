package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFD2E8D4)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        val icon1 = Icons.Rounded
        Image(
            painter = image,
            contentDescription = "logo",
            modifier = Modifier
                .padding(top = 100.dp)
                .size(200.dp)
        )
        Text(
            text = stringResource(R.string.fullname),
            fontSize = 45.sp
        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF197849),
            modifier = Modifier
                .padding(bottom = 140.dp)
        )
        Row {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            ) {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = stringResource(R.string.phone_logo),
                    tint = Color(0xFF006d3b),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = stringResource(R.string.shekhar0050m),
                    tint = Color(0xFF006d3b),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = stringResource(R.string.contact_email),
                    tint = Color(0xFF006d3b),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
            }
            Column {
                Text(
                    text = stringResource(R.string.contact_number),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Text(
                    text = stringResource(R.string.shekhar0050m),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Text(
                    text = stringResource(R.string.contact_email),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Card()
    }
}