package com.example.littlelemon

import android.view.RoundedCorner
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

@Composable
fun uppperPannel()
{

    val context= LocalContext.current
    Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
            , modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF495E57))) {
            Text(text =  stringResource(R.string.littleLemon),
                fontSize = 32.sp, color = Color.Yellow,
                modifier = Modifier.padding(start=10.dp))
            Text(text =  stringResource(R.string.address),
                fontSize = 16.sp,
                color = Color.Yellow,
                modifier = Modifier.padding(start=10.dp))
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.wrapContentHeight())
            {
                Text(text = stringResource(id = R.string.description),
                color=Color(0xFFEDEFEE),
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth(2/4f)
                        .wrapContentHeight())
                Image(painter = painterResource(id = R.drawable.little_lemon),
                    contentDescription = "Upper Panel Image",
                    modifier = Modifier.fillMaxWidth(0.75f).clip(RoundedCornerShape(20.dp))
                )

            }
            Button(onClick = { Toast.makeText(context,"Order Successful",Toast.LENGTH_SHORT).show() },
               shape= RoundedCornerShape(20.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFFF4CE14)))
            { Text(text = stringResource(id = R.string.order), fontSize = 18.sp) }

    }
}

