package seleniumTutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MailLogin {

	private WebDriver driver ;
	private String url;
	private String login;
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adam\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.youtube.com/";
		login = "pea";
	}
	
	@Test
	public void loginNegative() {
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
