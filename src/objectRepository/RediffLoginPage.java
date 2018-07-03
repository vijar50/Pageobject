package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver){
		this.driver=driver;
	}
	By username = By.xpath("//input[@name='login']");
	By password = By.xpath("//input[@name='passwd']");
	By go = By.xpath("//input[@value='Go']");
	By home = By.linkText("Home");

	public WebElement EmailId() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Submit() {
		return driver.findElement(go);
	}
	public WebElement Home() {
		return driver.findElement(home);
	}
}
