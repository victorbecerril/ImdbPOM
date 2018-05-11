package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbResultsPage {
private WebDriver driver;
	
	public ImdbResultsPage(WebDriver parentDriver) {
		driver = parentDriver;
	}
	
	WebElement resultsForLbl;
	WebElement titlesLbl;
	WebElement namesLbl;
	
	public boolean isAt() {
		return false;
	}
	
	public void validateMovieLink(String movieName, String movieYear) {
		
	}
	
	public void clickMovieLink(String movieName, String movieYear) {
		
	}


}
