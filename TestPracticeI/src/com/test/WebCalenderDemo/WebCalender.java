package com.test.WebCalenderDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalender {

	public static WebDriver driver;
	
	public static void BasicProces() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Kavita\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in");
	}
	
	public static void main(String[] args) {
		BasicProces();
	}
}
