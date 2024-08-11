package stepDefination;


import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.UserListPage;

public class UserListPageStepDefination extends BaseClass {
	
	
	UserListPage ulp;
	
	public UserListPageStepDefination()
	{
		super();	
		initialization();
		ulp=new UserListPage();
	}
	
	@Given("^Navigate to way2automation site$")
	public void navigate_to_URL() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@When("^Create a new user$")
	public void Create_a_new_user() 
	{
		ulp.addUserFunctinoality();
		ulp.fillFirstUserName("lahuji");
		ulp.fillLastUserName("pande");
		ulp.fillUserName("lahupande");
		ulp.fillPassword("lahupande@123");
		ulp.selectCustomer();
		ulp.fillUserEmail("lahupande01@gmail.com");
		ulp.fillCelephone("7620693306");
		ulp.selectUserRole("Admin");
		ulp.saveUser();
	}
	
	@Then("validate the newly user account")
	public void validate_the_newly_user_account() {
		String newUser=ulp.newUserCreationValidation();
		Assert.assertEquals("lahuji", newUser);
	}
	
	@Then("validate the deletion of new user accont")
	public void validate_the_deletion_of_new_user_accont() {
		ulp.removeUser();
		ulp.okBtn();
		Assert.assertFalse("lahuji",false);
	}
	
	
	

}
