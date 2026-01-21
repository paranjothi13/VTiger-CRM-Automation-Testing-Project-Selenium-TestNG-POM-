package genericUtillity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is an utility class which deals with properties class
 */

public class PropertiesUtility {
	/**
	 * This generic method used to fetch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
  public String getDatafromPropertiesFile(String key)throws IOException{
	FileInputStream fis = new FileInputStream(IpathUtility.propertiesPath);
   Properties prop=new Properties();
    prop.load(fis);
   // String url=prop.getProperty(key);
    return prop.getProperty(key);
  }
}
