package org.pojo;

import org.bc.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPojo extends BaseClass {
	public FBLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbt;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbt() {
		return loginbt;
	}

}
