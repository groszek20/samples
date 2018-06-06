package seleniumTutorial;

import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ImageComparision {
	private WebDriver driver;
	
	@Test
	public void imageComparision() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adam\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.onet.pl/");
		
		WebElement element = driver.findElement(By.cssSelector("#logoOnet"));
		Screenshot screenshot = new AShot().takeScreenshot(driver, element);
		ImageIO.write(screenshot.getImage(), "PNG", 
				new File(System.getProperty("user.dir")+"\\logo.png"));
		
		
		driver.quit();

	}
}
