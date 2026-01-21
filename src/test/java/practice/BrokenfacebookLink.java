package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtillity.SelenniumUtility;

public class BrokenfacebookLink {
@Test
	public void checkBrokenLink() throws IOException {
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SelenniumUtility suti=new SelenniumUtility();
		suti.maximizeWindow(d);
		suti.accessApplication(d,"https://www.facebook.com/");
		List<WebElement> allLinks=d.findElements(By.xpath("//a"));
		for(WebElement link:allLinks) {
			String attri = link.getAttribute("href");
			URL url = new URL(attri);
			HttpURLConnection open=(HttpURLConnection)url.openConnection();
			open.connect();
			int responseCode = open.getResponseCode();
			if(responseCode>=400) {
				System.out.println(attri);
				System.out.println("link is: "+link.getText());
			}
			
		}
		

	}

}
