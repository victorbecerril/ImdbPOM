package com.imdb.tests;

import org.junit.Test;

public class ImdbSearchMovie extends ImdbBaseTest {

	@Test
	public void testMovieSearch() {
		home.isAt();
		home.searchForMovie("her");
		results.isAt();
		results.validateMovieLink("Her", "2013");
		results.clickMovieLink("Her", "2013");
	}
	
}
