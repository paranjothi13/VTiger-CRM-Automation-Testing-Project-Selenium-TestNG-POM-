package genericUtillity;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is a utilty class which has functionality from Selenium library.
 */
public class SelenniumUtility {
	/**
	 * This method is used to perform maximize the browser
	 * @param driver
	 */
 public void maximizeWindow(WebDriver d) {
	 d.manage().window().maximize();
 }
 /**
  * This is a utility method used to access the application
  * @param driver
  * @param url
  */
 public void accessApplication(WebDriver d,String url) {
	 d.get(url);
 }
 /**
  * This method is used to provide implictWait
  * @param driver
  * @param maxTime
  */
 public void implicitWait(WebDriver d,int maxTime) {
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds( maxTime));
 }
 
                              /**MOUSE ACTIONS**/
 
 /**
  * This method used to perform mouse hover action
  * @param driver
  * @param element
  */
 public void mouseHoverAction(WebDriver d,WebElement element) {
	 Actions act=new Actions(d);
	 act.moveToElement(element).perform();
 }
 /**
  * This method used to perform right Click operation
  * @param driver
  * @param element
  */
 public void rightClick(WebDriver d,WebElement element) {
	 Actions act = new Actions(d);
	 act.contextClick(element).perform();
 }
 
                          /**ALERT POPUP**/
 
 /**
  * This method used to perform accept the alert operation
  * @param driver
  */
 public void acceptAlert(WebDriver d) {
	 d.switchTo().alert().accept();
 }
 /**
  * This method used to perform cancel the  alert
  * @param driver
  */
 public void cancelAlert(WebDriver d) {
	 d.switchTo().alert().dismiss();
 }
 
                                /**FRAMES**/
 
 /**
  * This method used to switch the frame using frame index
  * @param driver
  * @param frameindexvalue
  */
 public void switchToFrameUsingIndex(WebDriver d,int frameindexvalue) {
	 d.switchTo().frame(frameindexvalue);
 }
 /**
  * This method used to switch the frame using frame element
  * @param driver
  * @param element
  */
 public void switchToFrmaeUsingFrameElement(WebDriver  d,WebElement element) {
	 d.switchTo().frame(element);
 }
 /**
  * This method used to switch the frame using name or id attribute
  * @param driver
  * @param NameorId
  */
 public void switchToFrameUsingNameorId(WebDriver d,String NameorId) {
	 d.switchTo().frame(NameorId);
 }
                        /**Dropdown**/
 public void selectByOption(WebElement element, String value) {
	    String tag = element.getTagName();
	    String type = element.getAttribute("type");
	    if (tag.equalsIgnoreCase("select")) {
	        Select sel = new Select(element);
	        sel.selectByValue(value);
	    }
	    else if (tag.equalsIgnoreCase("input")
	            && (type == null || type.equalsIgnoreCase("text"))) {
	        element.clear();
	        element.sendKeys(value);
	    }
	    else {
	        if (!element.isSelected()) {
	            element.click();
	        }
	    }
	}
                 /**SCREENSHOT OF THE WEBPAGE**/
 /**
  * This method used to take a screenshot of a webpage
  * @param driver
  * @return
  * @throws IOException
  */
public String takeWebpageScreenshot(WebDriver driver,String screenshotname) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(".\\Screenshots\\"+screenshotname+".png");
	Files.copy(src, dest);
	return dest.getAbsolutePath();       //used for listeners
}
}
