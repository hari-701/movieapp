package com.example.movie.screen.home.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movie.model.MovieData
import com.example.movie.model.getMovies
import com.example.movie.navigation.MovieScreen
import com.example.movie.widgets.MovieRow

@ExperimentalAnimationApi
@Composable
fun HomeScreen(navController: NavController)
{
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent,
            elevation = 0.dp)
        {
            Text(text = "Movies")

        }
    }) {
        MainContent(navController = navController)
    }

}


@ExperimentalAnimationApi
@Composable
fun MainContent(navController: NavController, movieList: List<MovieData> = getMovies())
{
    Column(modifier = Modifier.padding(12.dp)){
        LazyColumn()
        {
            items(items = movieList)
            {

                MovieRow(movie = it){ movie ->
                    navController.navigate(route = MovieScreen.DetailsScreen.name+"/$movie")

                }

            }
        }

    }
}