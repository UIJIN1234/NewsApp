package com.example.newsapp.presentation.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewsAppTitle(title:String){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center // 수직 + 수평 가운데 정렬
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            lineHeight = 10.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
        IconButton(onClick = {  },
        modifier = Modifier.align(Alignment.CenterEnd))
        {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "검색",
                tint = Color.White
            )
        }

    }
}