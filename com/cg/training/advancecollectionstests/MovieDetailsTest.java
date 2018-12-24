package com.cg.training.advancecollectionstests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.advancecollections.MovieDetails;
import com.cg.training.advancecollections.MovieDetailsList;

public class MovieDetailsTest {
	private MovieDetails movieDetail1;
	private MovieDetails movieDetail2;
	private MovieDetails movieDetail3;
	private MovieDetailsList movieDetailsList;

	@Before
	public void setUp(){
		movieDetail1 = new MovieDetails("SwarnaKamalam", "Venkatesh",
				"Bhanu Priya", "classical");
		movieDetail2 = new MovieDetails("Yuganiki Okkadu", "Karthi",
				"Andrea", "Adventure");
		movieDetail3 = new MovieDetails("Badshah", "Jr.NTR",
				"Kajal", "comedy");
		 movieDetailsList = new MovieDetailsList();
	}
	@Test
	public void testForAddMethodForMovieDetailsList(){
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
	}
	
	@Test
	public void testForRemoveMethodForMovieDetailsList(){
		movieDetailsList.removeMovie(movieDetail3);
	}
	@Test
	public void testForRemoveMethodToRemoveAllTheMovieDetailsList(){
		boolean isEmptyList = movieDetailsList.removeAllMovies();
		assertTrue(isEmptyList);
	}
	
	@Test
	public void testForFindMovieByMovieName(){
		MovieDetails movieGetMovieByName = movieDetailsList.getMovieByName("Yuganiki Okkadu");
		System.out.println(movieGetMovieByName);
	}
	

}
