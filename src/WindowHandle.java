import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\YUvraj\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it= window.iterator();
		String parentID= it.next();
		String ChildID =it.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String emailID = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		 
		driver.findElement(By.id("username")).sendKeys(emailID);
	}

}
