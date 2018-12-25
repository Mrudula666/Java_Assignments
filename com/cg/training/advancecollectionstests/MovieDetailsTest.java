package com.cg.training.advancecollectionstests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.advancecollections.MovieDetails;
import com.cg.training.advancecollections.MovieDetailsList;
import com.cg.training.advancecollections.SavingAccount;
import com.cg.training.advancecollections.SortByName;

public class MovieDetailsTest<T> {
	private MovieDetails movieDetail1;
	private MovieDetails movieDetail2;
	private MovieDetails movieDetail3;
	private MovieDetails movieDetail4;
	private MovieDetailsList movieDetailsList;

	@Before
	public void setUp() {
		movieDetail1 = new MovieDetails("SwarnaKamalam", "Venkatesh",
				"Bhanu Priya", "classical");
		movieDetail2 = new MovieDetails("Yuganiki Okkadu", "Karthi", "Andrea",
				"Adventure");
		movieDetail3 = new MovieDetails("Badshah", "Jr.NTR", "Kajal", "comedy");
		movieDetail4 = new MovieDetails("Mumbai", "Aravindhaswami",
				"Manisha Koirala", "Romantic");
		movieDetailsList = new MovieDetailsList();

	}

	@Test
	public void testForAddMethodForMovieDetailsList() {
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
	}

	@Test
	public void testForRemoveMethodForMovieDetailsList() {
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
		boolean isMovieRemoved = movieDetailsList.removeMovie(movieDetail3);
		assertTrue(isMovieRemoved);
	}

	@Test
	public void testForRemoveMethodToRemoveAllTheMovieDetailsList() {
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
		boolean isEmptyList = movieDetailsList.removeAllMovies();
		assertTrue(isEmptyList);
	}

	@Test
	public void testForFindMovieByMovieName() {
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);

		MovieDetails result = movieDetailsList.getMovieByName("swarnaKamalam");
		assertEquals(
				"MovieDetails [movieName=SwarnaKamalam, leadActor=Venkatesh, leadActress=Bhanu Priya, genre=classical]",
				result.toString());
	}

	@Test
	public void testForFindMovieByGenre() {
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);

		MovieDetails result = movieDetailsList.getMovieByGenre("Comedy");
		assertEquals(
				"MovieDetails [movieName=Badshah, leadActor=Jr.NTR, leadActress=Kajal, genre=comedy]",
				result.toString());
	}

	@Test
	public void testForSortingTheMoviesByMovieName() {
		System.out.println("Sort By Movie Name:");
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
		movieDetailsList.addMovie(movieDetail4);
		List<MovieDetails> sortedMovieListByName = movieDetailsList
				.sortByName();
		for (MovieDetails movieDetails : sortedMovieListByName) {
			System.out.println(movieDetails.toString());
		}
	}

	@Test
	public void testForSortingTheMoviesByLeadActor() {
		System.out.println("Sort By Lead Actor: ");
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
		movieDetailsList.addMovie(movieDetail4);
		List<MovieDetails> sortedMovieListByLeadActor = movieDetailsList
				.sortByLeadActor();
		for (MovieDetails movieDetails : sortedMovieListByLeadActor) {
			System.out.println(movieDetails.toString());
		}
	}
	@Test
	public void testForSortingTheMoviesByLeadActress() {
		System.out.println("Sort By Lead Actress: ");
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
		movieDetailsList.addMovie(movieDetail4);
		List<MovieDetails> sortedMovieListByLeadActress = movieDetailsList
				.sortByLeadActress();
		for (MovieDetails movieDetails : sortedMovieListByLeadActress) {
			System.out.println(movieDetails.toString());
		}
	}
	
	@Test
	public void testForSortingTheMoviesByGenre() {
		System.out.println("Sort By Genre: ");
		movieDetailsList.addMovie(movieDetail1);
		movieDetailsList.addMovie(movieDetail2);
		movieDetailsList.addMovie(movieDetail3);
		movieDetailsList.addMovie(movieDetail4);
		List<MovieDetails> sortedMovieListByGenre = movieDetailsList
				.sortByGenre();
		for (MovieDetails movieDetails : sortedMovieListByGenre) {
			System.out.println(movieDetails.toString());
		}
	}

}
