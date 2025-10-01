package com.example.newsapp.presentation.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage


@Composable
fun NewsItemImage(title: String, description: String, imageUrl: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(150.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Row (modifier=Modifier.fillMaxSize())
        {
            AsyncImage(
                model = imageUrl,
                contentDescription = title,
                modifier = Modifier
                    .width(130.dp)
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

        }
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxHeight()
                    .weight(1f),
                verticalArrangement = Arrangement.Center

            ) {
                Text(title, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(description, fontSize = 14.sp)
            }

    }
}
