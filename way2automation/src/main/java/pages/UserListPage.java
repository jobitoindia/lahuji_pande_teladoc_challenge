package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class UserListPage extends BaseClass 
{	
	@FindBy(xpath="//button[@class='btn btn-link pull-right']")
	private WebElement addUserBtn;
	
	@FindBy(xpath="//input[@name='FirstName']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='LastName']")
	private WebElement lastnameField;
	
	@FindBy(xpath="//input[@name='UserName']")
	private WebElement usernameField;
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@name='optionsRadios']")
	private WebElement radioBtnField;
	
	@FindBy(xpath="//select[@name='RoleId']")
	private WebElement selectUserRoleField;
	
	@FindBy(xpath="//input[@name='Email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@name='Mobilephone']")
	private WebElement mobNoField;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement saveBtnField;
	
	@FindBy(xpath="//td[text()='lahuji']")
	private WebElement accountCreationValidation;
		
	@FindBy(xpath="//button[@ng-click='delUser()']")
	private WebElement userRemoveField;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okBtn;
	
	public UserListPage() 
	{
		PageFactory.initElements(driver, this); // it initiaze the current page elements
	}
	
	public void addUserFunctinoality() {
		addUserBtn.click();
	}
	
	public void fillFirstUserName(String fname) {
		firstNameField.sendKeys(fname);
	}
	
	public void fillLastUserName(String lname) {
		lastnameField.sendKeys(lname);
	}
	
	public void fillUserName(String uname) {
		usernameField.sendKeys(uname);
	}
	
	public void fillPassword(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void selectCustomer() {
		radioBtnField.click();
	}
	
	public void selectUserRole(String userRole) {
		Select selUser=new Select(selectUserRoleField);
		selUser.selectByVisibleText(userRole);
	}
	
	public void fillUserEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void fillCelephone(String cellphone) {
		mobNoField.sendKeys(cellphone);
	}
	
	public void saveUser() {
		saveBtnField.click();
	}
	
	public String newUserCreationValidation() {
		return accountCreationValidation.getText();
	}
	
	public void removeUser() {
		userRemoveField.click();
	}
	
	public void okBtn() {
		okBtn.click();
	}

}
