package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver){
		this.driver=driver;
		//initialize page factory objects to local driver object
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='login']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='passwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement go;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	public WebElement EmailId() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement Submit() {
		return go;
	}
	public WebElement Home() {
		return home;
	}
}
