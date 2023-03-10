package com.movies.project.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.movies.project.dao.MovieDao;
import com.movies.project.model.Movie;
@Repository
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select * from movie",
				BeanPropertyRowMapper.newInstance(Movie.class));
	}

	@Override
	public List<Movie> getmovieByGenreId(Long genreId) {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select * from movie where genre_id=?", (rs, rowNum)-> 
		{
			Movie m =new Movie();
			m.setId(rs.getLong(1));
			m.setName(rs.getString(2));
			m.setYear(rs.getInt(3));
			m.setGenreId(genreId);
			return m;
		},genreId);	
	}
}
