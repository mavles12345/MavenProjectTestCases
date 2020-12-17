package org.datadriven;

import java.io.IOException;

import org.base.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDrivenBaseClass extends UtilityClass {
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		
		loadurl("https://www.facebook.com/");
		
		WebElement txtEmail =driver.findElement(By.id("email"));
		
		String userName=excelRead(0, 0);
		
		fill(txtEmail, userName);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		
		String password = excelRead(0, 1);
		
		fill(txtPass, password);
		
		
		WebElement button=driver.findElement(By.name("login"));
		
		txtButton(button);
		
		//quitBrowser();
		
	}

}
