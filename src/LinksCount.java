import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\YUvraj\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement Fdriver = driver.findElement(By.xpath("//table[@class='gf-t']"));
		System.out.println(Fdriver.findElements(By.tagName("a")).size());
		WebElement Cdriver= Fdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Cdriver.findElements(By.tagName("a")).size());
		
		for (int i = 0 ; i<Cdriver.findElements(By.tagName("a")).size();i++)
		{
			String Clicktab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			Cdriver.findElements(By.tagName("a")).get(i).sendKeys(Clicktab);	
		}
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}		
}
}
