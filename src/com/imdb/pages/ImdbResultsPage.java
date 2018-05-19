package com.imdb.pages;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ImdbResultsPage {
private WebDriver driver;
private WebElement correctMovie;
	
	public ImdbResultsPage(WebDriver parentDriver) {
		driver = parentDriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//h1[@class = 'findHeader']")
	WebElement resultsForLbl;
	@FindBy(how = How.XPATH, using = "//h3[text() = 'Titles']")
	WebElement titlesLbl;
	@FindBy(how = How.XPATH, using = "//h3[text() = 'Names']")
	WebElement namesLbl;
	@FindBy(how = How.TAG_NAME, using = "td")
	List<WebElement> movieList;
	
	public boolean isAt() {
		return this.resultsForLbl.isDisplayed() &&
				this.titlesLbl.isDisplayed() &&
				this.namesLbl.isDisplayed();
	}
	
	public void validateMovieLink(String movieName, String movieYear) {
		//List<WebElement> movieList = driver.findElements(By.tagName("td"));
		for(WebElement movieItem : movieList) {
			if(movieItem.getText().contains(movieYear)) {
				correctMovie = movieItem;
				break;
			}
		}
	}
	
	public void clickMovieLink(String movieName, String movieYear) {
		correctMovie.click();
	}


}
