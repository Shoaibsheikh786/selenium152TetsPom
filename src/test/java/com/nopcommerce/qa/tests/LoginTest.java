package com.nopcommerce.qa.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	
	@Test
	public void verifyLoginInvalidCredentails()
	{
		lp.sendEmail("abc@gmail.com");  //wrong email and passwrod
		lp.sendPassword("abcdef");
		boolean b=lp.clickLogin();
		Assert.assertTrue(b);   //true ,
		
	}
	

}
