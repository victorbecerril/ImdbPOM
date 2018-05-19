package com.imdb.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.imdb.pages.ImdbHomePage;
import com.imdb.pages.ImdbResultsPage;

public class ImdbBaseTest {
	WebDriver driver;
	ImdbHomePage home;
	ImdbResultsPage results;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.imdb.com/");
		home = new ImdbHomePage(driver);
		results = new ImdbResultsPage(driver);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
