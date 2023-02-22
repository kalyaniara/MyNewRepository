package aadya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstPro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\kalyaning\\chromedriver_win32 (2).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		// TODO Auto-generated method stub
		//System.out.println("hello");

	}

}
