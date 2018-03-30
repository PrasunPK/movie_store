package com.basic.api.controller

import com.basic.api.model.Movie
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movies")
class MovieController {

    private val movies: MutableList<Movie> = ArrayList()
    private var counter: Int = 1

    @GetMapping("/")
    fun getAllMovies() = movies

    @GetMapping("/{id}")
    fun getMovie(@PathVariable("id") id: Int) =
            movies.find { it.id == id }


    @PostMapping("/add")
    fun addMovie(@RequestBody name: String) =
            movies.add(Movie(counter++, name))

    @DeleteMapping("/remove")
    fun removeMovie(@RequestBody id: Int) =
            movies.remove(getMovie(id))
}