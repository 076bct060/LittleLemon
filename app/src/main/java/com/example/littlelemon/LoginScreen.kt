package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemon.ui.theme.LittleLemonTheme
class LoginScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Login()

                }
            }
        }
    }
}

@Composable
fun Login()
{
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.little_lemon), contentDescription ="Logo Image" )
        TextField(value = "", onValueChange = {}, label = { Text(text = "UserName")})
        TextField(value = "", onValueChange = {}, label = {Text("Password")})
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.lightGrey)),
        shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Login", color = Color(R.color.white))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    LittleLemonTheme {
         Login()
    }
}