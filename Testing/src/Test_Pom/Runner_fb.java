package Test_Pom;

import org.testng.annotations.Test;

import POM.Facebook;

public class Runner_fb extends Generic_fb {
	
	@Test
	public static void test() throws InterruptedException {
		
		/*
		 * FEtchtext
		 * usr name 
		 * pwd
		 * login
		 */
		
		Facebook f = new Facebook(driver);
		f.text();
		Thread.sleep(2000);
		
		f.username("9538304797");
		Thread.sleep(2000);
		
		f.password("9538304747");
		Thread.sleep(2000);
		
		f.login();
		
		Thread.sleep(2000);
	}

}
