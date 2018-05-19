package com.imdb.pages;

//import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import junit.framework.Assert;

public class ImdbHomePage {
	private WebDriver driver;
	
	public ImdbHomePage(WebDriver parentDriver) {
		driver = parentDriver;
		//Un wait
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "home_img_holder")
	WebElement imdbLogoImg;
	@FindBy(how = How.NAME, using = "q")
	WebElement searchTxt;
	@FindBy(how = How.ID, using = "navbar-submit-button")
	WebElement searchBtn;
	
	public boolean isAt() {
		return this.imdbLogoImg.isDisplayed() &&
				this.searchTxt.isDisplayed() &&
				this.searchBtn.isDisplayed();
	}
	
	public void searchForMovie(String movieName) {
		//assertTrue(false);
		this.searchTxt.clear();
		this.searchTxt.sendKeys(movieName);
		this.searchBtn.click();
	}
	


}
