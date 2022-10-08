package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.Purple200


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Purple200)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.ic_launcher_background, "Text1"),
                        ItemRowModel(R.drawable.ic_launcher_background, "Text2"),
                        ItemRowModel(R.drawable.ic_launcher_background, "Text3"),
                        ItemRowModel(R.drawable.ic_launcher_background, "Text4"),
                        ItemRowModel(R.drawable.ic_launcher_background, "Text5"),
                        ItemRowModel(R.drawable.ic_launcher_background, "Text6"),
                        ItemRowModel(R.drawable.ic_launcher_background, "Text7"),
                    )
                ) { _, item ->
                    MyRow(item = item)
                }
            }
        }
    }
}
