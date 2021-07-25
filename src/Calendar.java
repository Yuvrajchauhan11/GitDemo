import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\YUvraj\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
}

}
