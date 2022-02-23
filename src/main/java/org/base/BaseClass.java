package org.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {

	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		
	public static void maximizeWindow() {
		driver.manage().window().maximize();
		
	}

	public static void url(String url) {
		driver.get(url);
	}
	
	public static void passText(String txt , WebElement element) {
		element.sendKeys(txt);
	}
	
	public static void passWord(String wrd, WebElement element) {
		element.sendKeys(wrd);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void PageUrl(){
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void clickByUsingJavaScript(WebElement targetWebElement) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", targetWebElement);
	}

}
