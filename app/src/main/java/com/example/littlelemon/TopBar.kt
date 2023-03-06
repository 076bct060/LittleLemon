package com.example.littlelemon

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(scaffoldState: ScaffoldState?=null,scope:CoroutineScope?=null) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { scope?.launch {  scaffoldState?.drawerState?.open()} }) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")

        }
        Image(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(0.5f),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo"
        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "cart")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}