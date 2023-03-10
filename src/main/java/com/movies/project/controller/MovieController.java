package com.movies.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.project.model.Movie;
import com.movies.project.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieservice;

	@GetMapping("/all")
	public List<Movie> getAllMovies() {
		return movieservice.getAllMovies();
	}

	@GetMapping("genre/{id}")
	public List<Movie> getMovieByGenrId(@PathVariable Long id) {
		return movieservice.getmovieByGenreId(id);
	}
}
