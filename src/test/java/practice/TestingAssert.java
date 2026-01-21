package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestingAssert {
@Test
public void levelHardAssertion() {
	String expname="Marry Christmas";
	String actname="Marry Christmas";
	System.out.println("strict level hard assertion ends");
	Assert.assertEquals(expname,actname);
	System.out.println("strict level hard assertion ends");
}
@Test
public void containsHardLevelAssertion() {
	String expname="Hiii";
	String actname="Hi";
	System.out.println("contains level hard assertion starts");
	Assert.assertTrue(expname.contains(actname));
	System.out.println("contains level hard assertion ends ");
}

@Test
public void softLevelAssertion() {
	String actname="enna";
	String expname="enne";
	  SoftAssert s = new SoftAssert();
	  System.out.println("level soft assertion starts");
	  s.assertEquals(actname,expname);
	  System.out.println("soft level assertion starts");
	  s.assertAll();             
}
}
