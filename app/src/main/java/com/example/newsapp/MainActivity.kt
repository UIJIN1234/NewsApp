package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.domain.NewsItemList
import com.example.newsapp.domain.SourceList
import com.example.newsapp.presentation.theme.NewsAppTheme
import com.example.newsapp.presentation.ui.composable.NewsAppTitle
import com.example.newsapp.presentation.ui.composable.NewsItemImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
   val NEWS_SECRET_KEY = BuildConfig.NEWS_SECRET_KEY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            @OptIn(ExperimentalMaterial3Api::class)
            NewsAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = { Text("뉴스") },
                            actions = {
                                IconButton(onClick = { /* 검색 액션 */ }) {
                                    Icon(Icons.Default.Search, contentDescription = "검색")
                                }
                            }
                        )
                    }
                ) { innerPadding ->
                    // 메인 콘텐츠 (뉴스 리스트 등)
                    Greeting(
                        text = "뉴스",
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(text:String,name: String, modifier: Modifier = Modifier) {
    val newsList = listOf(
        NewsItemList(
            source = SourceList("1", "연합뉴스"),
            author = "홍길동",
            title = "삼성, 새로운 갤럭시 출시!",
            description = "최신 갤럭시 모델이 공개되었습니다.",
            url = "https://example.com/news1",
            urlToImage = "https://picsum.photos/400/200",
            publishedAt = "2025-09-29T10:00:00Z",
            content = "갤럭시 신제품 기사 내용"
        )
    )
    Column(modifier = Modifier.fillMaxHeight()) {
        NewsAppTitle(text)

        LazyColumn {
            items(newsList) { news ->
                NewsItemImage(
                    title = news.title,
                    description = news.description,
                    imageUrl = news.urlToImage
                )
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewsAppTheme {
        Column {
            Greeting("NewsApp", "Android")

        }
    }
}