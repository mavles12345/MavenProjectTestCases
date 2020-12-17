package org.pom;

import java.io.IOException;

import org.base.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PomTc1 extends UtilityClass {

	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		
		loadurl("https://www.facebook.com/");
		
		//WebElement txtEmail=driver.findElement(By.id("email"));
		
		String username=excelRead(0, 0);
		
		//WebElement txtPass=driver.findElement(By.id("pass"));
		
		String password = excelRead(0, 1);
		
		PojoClasslogin l=new PojoClasslogin();
		
		fill(l.getTxtEmail().get(0), username);
		
		fill(l.getTxtPass().get(0), password);
		
		txtButton(l.getBtnLogin().get(0));
		
		quitBrowser();
		
		
		
		
		
		
		

	}

}
