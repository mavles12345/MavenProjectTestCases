package org.pom;

import java.util.List;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClassTC2 extends UtilityClass{

	
	
	public PojoClassTC2() {
	
		PageFactory.initElements(driver, this);
		
	}

	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(name="email")})
	
		private List<WebElement> txtEmail;
	
		
	@FindAll({@FindBy(id="pass"), @FindBy(name="pass")})
	private List<WebElement> txtPass;
	
	@FindBy(name="login")
	
	private WebElement btnLogin;

	public List<WebElement> getTxtEmail() {
		return txtEmail;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	

	}


