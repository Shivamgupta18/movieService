package com.movies.project.dao;

import java.util.List;

import com.movies.project.model.Movie;

public interface MovieDao {

	 List<Movie> getAllMovies();
	 List<Movie> getmovieByGenreId(Long genreId);
}
