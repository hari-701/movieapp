package com.example.movie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movie.model.MovieData
import com.example.movie.navigation.MovieNavigation
import com.example.movie.ui.theme.MovieTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                 Myapp {
                     MovieNavigation()
                 }
        }
    }
}

@Composable
fun Myapp(content:@Composable () -> Unit)
{
    MovieTheme {
            content()

    }
}





    @ExperimentalAnimationApi
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Myapp {
            MovieNavigation()
        }
    }

