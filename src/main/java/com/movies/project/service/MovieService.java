package com.movies.project.service;

import java.util.List;

import com.movies.project.model.Movie;

public interface MovieService {

	List<Movie> getAllMovies();
	 List<Movie> getmovieByGenreId(Long genreId);

}
