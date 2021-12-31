package com.arvind.tablayoutcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arvind.tablayoutcomposeapp.navigation.Navigation
import com.arvind.tablayoutcomposeapp.ui.theme.Purple200
import com.arvind.tablayoutcomposeapp.ui.theme.TabLayoutComposeAppTheme
import com.arvind.tablayoutcomposeapp.ui.theme.colorPrimary
import com.arvind.tablayoutcomposeapp.view.*
import com.google.accompanist.pager.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TabLayoutComposeAppTheme {
                TabLayoutComposeUiMain()
            }

        }
    }

    @ExperimentalPagerApi
    @Composable
    fun TabLayoutComposeUiMain() {
        TabLayoutComposeAppTheme {
            Surface(color = MaterialTheme.colors.background) {
                Navigation()
            }

        }
    }

    @ExperimentalPagerApi
    @Preview(showBackground = true)
    @Composable
    fun TabLayoutComposeUiMainPreview() {
        TabLayoutComposeUiMain()
    }

}


