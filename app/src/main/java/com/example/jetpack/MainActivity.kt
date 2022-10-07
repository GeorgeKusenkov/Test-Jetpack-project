package com.example.jetpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircleItem()
            }

        }
    }
}


@Composable
private fun CircleItem() {
    val count = remember {
        mutableStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.Blue)
    }

    Box(modifier = Modifier
        .size(100.dp)
        .background(color = color.value, shape = CircleShape)
        .clickable {

            when(++count.value) {
                10 -> color.value = Color.Red
                20 -> color.value = Color.Cyan
            }
        },
        contentAlignment = Alignment.Center
    ) {
        Text(text = count.value.toString(), style = TextStyle(color = Color.White), fontSize = 20.sp)
    }
}

@Composable
private fun ListItem(name: String, profession: String) {
    var count = remember {
        mutableStateOf(0)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                count.value++
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ) {
        
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                
                Column() {
                    Text(text = count.value.toString())
                    Text(text = profession)
                }

            }

        }
        
    }
}


@Composable
fun ShowFigure() {
    Row(
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello")
            Text(text = "Android")
            Text(text = "Again")
        }

        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello")
            Text(text = "Android")
            Text(text = "Again")
        }
    }
}