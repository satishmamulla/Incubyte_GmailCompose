package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefinition {

   WebDriver driver;
   WebDriverWait wait;
   
   @Given("^the user navigates to Gmail application$")
     public void the_user_navigates_to_Gmail_application() throws Throwable {
	   Reusable.getinstance().openbrowser();
   }

   @When("^user enter Email Id as \"([^\"]*)\" then click on Next Button$")
     public void user_enter_Email_Id_as_then_click_on_Next_Button(String arg1) throws Throwable {
	  Reusable.getinstance().email_ID(arg1);
   }

   @When("^user enter Password as \"([^\"]*)\" then click on Next Button$")
     public void user_enter_Password_as_then_click_on_Next_Button(String arg1) throws Throwable {
	   Reusable.getinstance().password(arg1);
   }
	
   @And("^I click Compose Button in Gmail Home Page$")
     public void I_click_Compose_Button_in_Gmail_Home_Page() throws Throwable {
	   Reusable.getinstance().compose();
   }

   @When("^I Enter Email Id as \"([^\"]*)\" in To textbox$")
     public void i_Enter_Email_Id_as_in_To_textbox(String arg1) throws Throwable {
	   Reusable.getinstance().emailID_To(arg1);
   }

   @When("^I Enter Subject as \"([^\"]*)\" in Subject textbox$")
     public void i_Enter_Subject_as_in_Subject_textbox(String arg1) throws Throwable {
       Reusable.getinstance().subject(arg1);
   }

   @When("^I Enter \"([^\"]*)\" to Message Body textbox$")
     public void i_Enter_to_Message_Body_textbox(String arg1) throws Throwable {
       Reusable.getinstance().messagebody(arg1);
   }
   
   @And("^I click on Send Button$")
     public void I_click_on_Send_Button() throws Throwable{
	   Reusable.getinstance().sendBtn();
   }
   
   
   
	
}
