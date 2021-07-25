import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\YUvraj\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("autocomplete")).sendKeys("ind");

		List<WebElement> option =driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li[2]/div"));

		for(WebElement data :option)

		{

		if(data.getText().equalsIgnoreCase("India"))

		{

		data.click();

		break;

		}

		}

		}

		}



