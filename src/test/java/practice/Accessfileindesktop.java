package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtillity.PropertiesUtility;

public class Accessfileindesktop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//      FileInputStream fis=new FileInputStream("C:\\Users\\asus\\OneDrive\\Desktop\\proprties\\data.properties");
//	Properties p = new Properties();
//	p.load(fis);
//	String URL=p.getProperty("url");
//	String Product=p.getProperty("product");
//	String UN=p.getProperty("username");
//	String PW=p.getProperty("password");
//	System.out.println(UN);
//	System.out.println(PW);
//	
//      WebDriver d = new ChromeDriver();
//      d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//      d.get(URL);
//      d.findElement(By.name("q")).sendKeys(Product,Keys.ENTER);
		
     PropertiesUtility uti = new	 PropertiesUtility();
//     String link=uti.getDatafromPropertiesFile("url");
//     String product=uti.getDatafromPropertiesFile("product");
//     WebDriver d = new ChromeDriver();
//     d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//     d.get(link);
//     d.findElement(By.xpath("//input[@name='q']")).sendKeys(product,Keys.ENTER);
		String url=uti.getDatafromPropertiesFile("url");
		System.out.println(url);
	}

}
