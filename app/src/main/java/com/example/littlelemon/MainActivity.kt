package com.example.littlelemon

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {


                }
            }
        }
    }
}


@Composable
fun GUI()
{
    LittleLemonTheme {
        Column(Modifier.fillMaxSize()
        , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Title()
            Body()
        }
    }
}
@Composable
fun Title()
{
    Text(text =  stringResource(R.string.littleLemon), fontSize = 32.sp)
    Text(text =  stringResource(R.string.address), fontSize = 16.sp)
}
@Composable
fun Body()
{
    LittleLemonTheme{
        Row()
        {
            Button(onClick = { /*TODO*/ })
            { Text(text = stringResource(id = R.string.order), fontSize = 11.sp)}
            val imageModifier=Modifier.
                size(60.dp,60.dp)
            Image(painter = painterResource(id = R.drawable.little_lemon), contentDescription = "", contentScale = ContentScale.Fit,
            modifier = imageModifier)
        }
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LittleLemonTheme {
        GUI()
    }
}