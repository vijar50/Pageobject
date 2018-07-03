package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;
	public RediffHomePage(WebDriver driver){
		this.driver=driver;
	}
	
	By searchB = By.xpath("//div[@id='srch_show_hide_btn']");
	By searchF = By.id("srchword");
	By searchC = By.xpath("//input[@class='newsrchbtn']");
	
	public WebElement searchButton() {
		return driver.findElement(searchB);
	}
	
	public WebElement searchField() {
		return driver.findElement(searchF);
	}
	
	public WebElement searchClick() {
		return driver.findElement(searchC);
	}

}
