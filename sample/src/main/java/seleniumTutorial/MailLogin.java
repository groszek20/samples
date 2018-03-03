package seleniumTutorial;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MailLogin {

	private WebDriver driver ;
	private String url;
	private String login;
	private String passWord;
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adam\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.onet.pl/";
		login = "pea";
		passWord = "dupa";
	}
	
	@Test
	public void loginNegative() {
		driver.get(url);
		driver.findElement(By.partialLinkText("E-MAIL")).click();
		
		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.clear();
		loginElement.sendKeys(login);
		
		WebElement passwordElement = driver.findElement(By.id("f_password"));
		passwordElement.clear();
		passwordElement.sendKeys(passWord);
		
		driver.findElement(By.xpath("//input[@value='Zaloguj']")).click();
		
		Assert.assertFalse(driver.getPageSource().contains("Wprowadü poprawny adres e-mail"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
