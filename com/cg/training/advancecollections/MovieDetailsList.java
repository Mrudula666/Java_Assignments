/**
 * 
 */
package com.cg.training.advancecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mrnimmal
 *
 */
public class MovieDetailsList {
	 List<MovieDetails> listOfMovies =  new ArrayList<MovieDetails>();
	
	//List to add method in list.
	public void addMovie(MovieDetails movieDetails) {
		listOfMovies.add(movieDetails);
	}

	public void removeMovie(MovieDetails movieDetails) {
		listOfMovies.remove(movieDetails);
		System.out.println(movieDetails);
		
	}

	public boolean removeAllMovies() {
		listOfMovies.removeAll(listOfMovies);
		if(listOfMovies.isEmpty())
			return true;
		else 
			return false;
		
	}

	public  MovieDetails getMovieByName(String movieName) {
		MovieDetails getMovieByMovieName = null;
		Iterator<MovieDetails> iterator = listOfMovies.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getMovieName().equalsIgnoreCase(movieName))
				getMovieByMovieName = iterator.next();
			System.out.println(getMovieByMovieName);
			break;
		}
		return getMovieByMovieName;
	}
	

}
