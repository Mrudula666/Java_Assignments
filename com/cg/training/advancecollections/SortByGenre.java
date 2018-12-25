/**
 * 
 */
package com.cg.training.advancecollections;

import java.util.Comparator;

/**
 * @author mrnimmal
 *
 */
public class SortByGenre extends MovieDetails implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movieDetails1, MovieDetails movieDetails2) {
		
		return (movieDetails1.getGenre().compareTo(movieDetails2.getGenre()));
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	

}
