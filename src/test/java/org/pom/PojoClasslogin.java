package org.pom;

import java.util.List;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClasslogin extends UtilityClass {
	
	//constructor
	public PojoClasslogin() {
		
		PageFactory.initElements(driver, this);

	}
//private webelements
	@FindBy(id="email")
private List<WebElement> txtEmail;

	@FindBy(id="pass")
	private List<WebElement> txtPass;
	
	@FindBy(name="login")	
		private List<WebElement> btnLogin;

	public List<WebElement> getTxtEmail() {
		return txtEmail;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
		
	
		
	}
	


