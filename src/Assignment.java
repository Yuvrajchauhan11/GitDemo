import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver", "E:\\YUvraj\\Drivers\\Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://the-internet.herokuapp.com");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Multiple Windows")).click();
			driver.findElement(By.linkText("Click Here")).click();
			Set<String> window = driver.getWindowHandles();
			Iterator<String> it= window.iterator();
			String parentID= it.next();
			String ChildID =it.next();
			driver.switchTo().window(ChildID);
			System.out.println(driver.findElement(By.xpath("//div[@class= 'example']/h3")).getText());
			driver.switchTo().window(parentID);
			System.out.println(driver.findElement(By.xpath("//div[@class= 'example']/h3")).getText());			
	}

}
