package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbHomePage {
	private WebDriver driver;
	
	public ImdbHomePage(WebDriver parentDriver) {
		driver = parentDriver;
	}
	
	WebElement imdbLogoImg;
	WebElement searchTxt;
	WebElement searchBtn;
	
	public boolean isAt() {
		return false;
	}
	
	public void searchForMovie(String movieName) {
		
	}
	


}
