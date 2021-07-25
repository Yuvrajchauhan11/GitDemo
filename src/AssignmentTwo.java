import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\YUvraj\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@Id= 'content']")).getText());
	}
}
