package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.partialLinkText("COMPUTERS"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("DESKTOPS"));
		
		quit
	}

}
