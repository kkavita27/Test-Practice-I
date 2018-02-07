package com.org.test.moduleA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
		

public class IFrameDemo {

	public static WebDriver driver;
	public static String url = "http://toolsqa.com";
	public static WebDriverWait wait;
	public static JavascriptExecutor jse;
	static By demo_site = By.xpath("(//span[@class='menu-text'][contains(text(),'DEMO SITES')])[1]");
	static By iframe_link = By.xpath("//span[@class='menu-text'][contains(text(),'IFrame practice page')])[1]");

	public static void Browser_URL_Launch() {
		System.setProperty("webdriver.chrome.driver", "D:/Practice/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		wait = new WebDriverWait(driver, 20);
		driver.findElement(demo_site);
		wait.until(ExpectedConditions.visibilityOf((WebElement) demo_site));
		driver.findElement(iframe_link);
		action.moveToElement((WebElement) demo_site).build().perform();
		wait.until(ExpectedConditions.visibilityOf((WebElement) iframe_link));
		((WebElement) iframe_link).click();
	}
	
	public static void workingWithIframe() throws InterruptedException {
		Thread.sleep(1000);
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='IF1']"));
		driver.switchTo().frame(frame1);
//		driver.findElement(By.partialLinkText("Partial Link Test")).click();
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Kavita");
	}


	public static void main(String[] args) throws InterruptedException {
		Browser_URL_Launch();
		workingWithIframe();
	}

}
