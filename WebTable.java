package com.org.test.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {
	public static WebDriver driver;
	public static String chDriverPath;
	public static WebDriverWait wait;
	public static List<WebElement> dates;

	public static void basicProcess() {
		chDriverPath = "D:/Practice-I/chromedriver_win32/";
		System.setProperty("webdriver.chrome.driver", chDriverPath + "chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in/");
		wait = new WebDriverWait(driver, 6);
		WebElement a1 = driver
				.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		wait.until(ExpectedConditions.visibilityOf(a1));
		a1.click();

	}

	public static void dateSelection() {
		dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody//td"));
		int totalDates = dates.size();

		for (int i = 0; i < totalDates; i++) {
			String date = dates.get(i).getText();

			if (date.equalsIgnoreCase("15")) {
				dates.get(i).click();
				break;
			}
		}

	}

	public static void main(String[] args) {
		basicProcess();
		dateSelection();
	}
}
