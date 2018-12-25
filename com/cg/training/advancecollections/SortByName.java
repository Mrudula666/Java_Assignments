/**
 * 
 */
package com.cg.training.advancecollections;

import java.util.Comparator;

/**
 * @author mrnimmal
 *
 */
public class SortByName  extends MovieDetails implements Comparator<MovieDetails> {

	

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		return (arg0.getMovieName().compareTo(arg1.getMovieName()));
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */

	

}
