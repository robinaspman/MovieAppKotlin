package com.example.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf()
    Movie(
        id = "tt58546",
        title = "Avatar",
        year = "2009",
        genre = "Action, Adventure, Fantasy",
        director = "James Cameron",
        actors = "Sam Worthington",
        plot = "A paralytic marine",
        rating = "7.9"

    )
}
