package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceesFacebookbyvariable {

	public static void main(String[] args) throws InterruptedException {
			WebDriver d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			String value="bunny@gmail.com";
			d.get("https://www.facebook.com/");
			Thread.sleep(3000);
			WebElement ele = d.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		ele.sendKeys(value);
		d.navigate().refresh();
		Thread.sleep(3000);
		ele.sendKeys(value);
	}

}
