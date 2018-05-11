package com.imdb.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.imdb.pages.ImdbHomePage;
import com.imdb.pages.ImdbResultsPage;

public class ImdbBaseTest {
	WebDriver driver;
	ImdbHomePage home;
	ImdbResultsPage results;
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}

}
