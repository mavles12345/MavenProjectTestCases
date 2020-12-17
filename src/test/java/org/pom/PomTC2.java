package org.pom;

import java.io.IOException;

import org.base.UtilityClass;

public class PomTC2 extends UtilityClass{
	
	public static void main(String[] args) throws IOException {
		
		
		launchBrowser();
		
		loadurl("https://www.facebook.com/");
		
		String userName = excelRead(0, 0);
		
		String passWord=excelRead(0, 1);
		
		PojoClassTC2 l=new PojoClassTC2();
		
		fill(l.getTxtEmail().get(0), userName);
		
		fill(l.getTxtPass().get(0), passWord);
		
		txtButton(l.getBtnLogin());
		
		
		
		
	}

}
