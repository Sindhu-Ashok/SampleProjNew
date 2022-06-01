package SampleProjectTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleprojectTest {
	//HEYY branch1
		@Test
		public void testName() throws Exception 
		{
			String browser = System.getProperty("BROWSER");
			Reporter.log("Heyyy",true);
			Reporter.log("Heyy-Heyyy",true);
			Reporter.log("Heyyy-Heyyy-Heyyy",true);
			Reporter.log("Byyeee",true);
			Reporter.log(browser,true);
		}
	}
//Byyee branch2
