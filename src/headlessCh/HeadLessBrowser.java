package headlessCh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options=new ChromeOptions();
//		driver=new ChromeDriver(options);
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users/Brigosha_Guest/Desktop/NewEclipse/Practise/Driver/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://newpmt.brigosha.com/login");
		
		
	}

}
