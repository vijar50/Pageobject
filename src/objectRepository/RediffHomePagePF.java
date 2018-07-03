package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {

	WebDriver driver;
	public RediffHomePagePF(WebDriver driver){
		this.driver=driver;
		//initialize page factory objects to local driver object
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='srch_show_hide_btn']")
	WebElement searchB;
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement searchF;
	
	@FindBy(xpath="//input[@class='newsrchbtn']")
	WebElement searchC;
	
	public WebElement searchButton() {
		return searchB;
	}
	
	public WebElement searchField() {
		return searchF;
	}
	
	public WebElement searchClick() {
		return searchC;
	}

}
