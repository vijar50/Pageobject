package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffHomePagePF;
import objectRepository.RediffLoginPage;

public class LoginApplication {

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Create an object for the RediffLoginPage
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("password111");
		rd.Submit().click();
		rd.Home().click();
		//Create an object for the RediffHomePage, but we will use the Page Factory version RediffHomePagePF
		RediffHomePagePF rh = new RediffHomePagePF(driver);

		rh.searchButton().click();
		Thread.sleep(2000);
		rh.searchField().sendKeys("A search");
		Thread.sleep(1000);
		rh.searchClick().click();
	}
	
}
