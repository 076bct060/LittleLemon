package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.*

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//           HomeScreen()

                AddItem()




            }
        }
    }


//@Composable
//fun HomeScreen(){
//    Column() {
//        uppperPannel()
//        LowerPanel()
//
//    }
//}
@Composable
private fun AddItem()
{
    var count by rememberSaveable() {
        mutableStateOf(0)
    }
    Column( modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally
    , verticalArrangement = Arrangement.Center) {
        Card(modifier = Modifier.fillMaxWidth(), elevation = 30.dp) {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(20.dp)) {
                Text("Greek Salad",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Row( modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                    IconButton(onClick = { count-- }) {
                        Icon(imageVector = Icons.Default.Remove, contentDescription ="Remove" )
                    }
                    Text(text = count.toString(), fontWeight = FontWeight.Bold, fontSize = 32.sp)
                    IconButton(onClick = { count++ }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription ="Add count" )
                    }
                }
                Button(onClick = { /*TODO*/ }) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                        Text("Add")

                    }

                }
            }

        }


    }

}




@Preview(showBackground = true)
@Composable
fun AddItemPreview(){
    AddItem()
}
