/**
 * 
 */
package com.cg.training.advancecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author mrnimmal
 *
 */
public class MovieDetailsList extends MovieDetails{
	List<MovieDetails> listOfMovies = new ArrayList<MovieDetails>();

	// List to add method in list.
	public void addMovie(MovieDetails movieDetails) {
		listOfMovies.add(movieDetails);
		
	}
	//methosd to removie a movie
	public boolean removeMovie(MovieDetails movieDetails) {
		boolean isMovieRemoved = listOfMovies.remove(movieDetails);
		return isMovieRemoved;

	}
	//method to remove all the movie details from list
	public boolean removeAllMovies() {
		listOfMovies.removeAll(listOfMovies);
		if (listOfMovies.isEmpty())
			return true;
		else
			return false;

	}
	//method to get the movie details when movie name is given

	public MovieDetails getMovieByName(String movieName) {
		MovieDetails getMovieByMovieName = null;
		for (MovieDetails movieDetails : listOfMovies) {
			if(movieDetails.getMovieName().equalsIgnoreCase(movieName)){
				getMovieByMovieName = movieDetails;
				break;
			}
			
		}
		
		return getMovieByMovieName;
	}
	//method to get the movie details when genre is given
	public MovieDetails getMovieByGenre(String genre) {
		for (MovieDetails movieDetails : listOfMovies) {
			if(movieDetails.getGenre().equalsIgnoreCase(genre))
				return movieDetails;
		}
		return null;
	}
	//Method to sort the given movie details in the order of the movie names

	public List<MovieDetails> sortByName() {
		List<MovieDetails> listOfMoviesSortedByTheirMovieName = new ArrayList<MovieDetails>();
		Collections.sort(listOfMovies,new SortByName());
		Iterator<MovieDetails> iterator = listOfMovies.iterator();
		while (iterator.hasNext()) {
			listOfMoviesSortedByTheirMovieName.add(iterator.next());
		}
		return listOfMoviesSortedByTheirMovieName;
	}
	//Method to sort the given movie details in the order of the lead actor

	public List<MovieDetails> sortByLeadActor() {
		List<MovieDetails> listOfMoviesSortedByLeadActor = new ArrayList<MovieDetails>();
		Collections.sort(listOfMovies, new SortByLeadActor());
		Iterator<MovieDetails> iterator = listOfMovies.iterator();
		while (iterator.hasNext()) {
			listOfMoviesSortedByLeadActor.add(iterator.next());
		}
		return listOfMoviesSortedByLeadActor;
	}
	//Method to sort the given movie details in the order of lead actress

	public List<MovieDetails> sortByLeadActress() {
		List<MovieDetails> listOfMoviesSortedByLeadActress = new ArrayList<MovieDetails>();
		Collections.sort(listOfMovies, new SortByLeadActress());
		Iterator<MovieDetails> iterator = listOfMovies.iterator();
		while (iterator.hasNext()) {
			listOfMoviesSortedByLeadActress.add(iterator.next());
		}
		return listOfMoviesSortedByLeadActress;
		
	}
	//Method to sort the given movie details in the order of the genre

	public List<MovieDetails> sortByGenre() {
		List<MovieDetails> listOfMoviesSortedByGenre = new ArrayList<MovieDetails>();
		Collections.sort(listOfMovies, new SortByGenre());
		Iterator<MovieDetails> iterator = listOfMovies.iterator();
		while (iterator.hasNext()) {
			listOfMoviesSortedByGenre.add(iterator.next());
		}
		return listOfMoviesSortedByGenre;
	}


}
