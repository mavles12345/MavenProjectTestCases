package org.datadriven;

import java.io.IOException;

import org.base.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleExcercise2 extends UtilityClass {

	public static void main(String[] args) throws IOException {
		
		//adding date into facebook through datadriven
		
		launchBrowser();
		
		loadurl("https://www.facebook.com/");
		
		WebElement txtUsername=driver.findElement(By.id("email"));
		
		String value=excelRead(0, 0);
		
		fill(txtUsername, value);
		
		
		WebElement txtPass=driver.findElement(By.id("pass"));
		
		String value1=excelRead(0, 1);
		
		fill(txtPass, value1);
		
		driver.findElement(By.name("login"));

	}

}
