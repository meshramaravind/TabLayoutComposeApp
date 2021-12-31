package com.arvind.tablayoutcomposeapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MusicVideo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arvind.tablayoutcomposeapp.ui.theme.Purple200
import com.arvind.tablayoutcomposeapp.ui.theme.colorPrimary
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun TabHome() {
    Column {
        TopBar()
        TabScreen()
    }


}

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = "TabLayout", color = Color.White) },
        backgroundColor = colorPrimary,
    )
}

@ExperimentalPagerApi
@Composable
fun TabScreen() {
    val pagerState = rememberPagerState(pageCount = 3)

    Column(
        modifier = Modifier.background(Color.White)
    )
    {
        Tabs(pagerState = pagerState)
        TabsContent(pagerState = pagerState)

    }
}


@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {
    val list = listOf("Home", "Music", "Movies")
    val lists = listOf(
        Icons.Filled.Home,
        Icons.Filled.MusicVideo,
        Icons.Filled.Movie

    )
    val scope = rememberCoroutineScope()
    TabRow(selectedTabIndex = pagerState.currentPage,
        backgroundColor = colorPrimary,
        contentColor = Color.White,
        divider = {
            TabRowDefaults.Divider(
                thickness = 3.dp,
                color = Color.White
            )
        },
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 3.dp,
                color = Purple200
            )

        }
    ) {
        list.forEachIndexed { index, _ ->
            Tab(
                text = {
                    Text(
                        text = list[index],
                        color = if (pagerState.currentPage == index) Color.White else Color.LightGray
                    )
                },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
                icon = {
                    Icon(imageVector = lists[index], contentDescription = null)
                }
            )
        }

    }


}

@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState) {
    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> TabHomeScreen(tabName = "Home Tab Layout")
            1 -> TabMusicScreen(tabName = "Music Tab Layout")
            2 -> TabMoviesScreen(tabName = "Movies Tab Layout")
        }

    }

}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun TabHomePreview() {
    TabHome()
}

