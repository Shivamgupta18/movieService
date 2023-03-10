package com.movies.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.project.dao.MovieDao;
import com.movies.project.model.Movie;
import com.movies.project.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao moviedao;
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return moviedao.getAllMovies();
	}

	@Override
	public List<Movie> getmovieByGenreId(Long genreId) {
		// TODO Auto-generated method stub
		return moviedao.getmovieByGenreId(genreId);
	}

}
