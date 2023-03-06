package com.example.littlelemon

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerPanel(scaffoldState: ScaffoldState,scope:CoroutineScope)
{
    List(10){ Text(text = "item $it")}
    IconButton(onClick = {  scope?.launch { scaffoldState?.drawerState?.close() }}) {
        Icon(imageVector = Icons.Default.ExitToApp, contentDescription ="" )
    }
}