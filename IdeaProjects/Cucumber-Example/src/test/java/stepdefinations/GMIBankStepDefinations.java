package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GMIBankHomePage;
import pages.GMIEmployeeDefaultPage;
import utilities.Driver;

public class GMIBankStepDefinations {

    GMIBankHomePage gmiBankHomePage=new GMIBankHomePage();
    GMIEmployeeDefaultPage gmiEmployeeDefaultPage=new GMIEmployeeDefaultPage();

    @Given("user logs in as an admin")
    public void user_logs_in_as_an_admin() {

        gmiBankHomePage.loginApplication("gino.wintheiser","%B6B*q1!TH");

    }
    @Given("navigates to ‘Create or Edit user page’")
    public void navigates_to_create_or_edit_user_page() {
        gmiEmployeeDefaultPage.myOperationDropDown.click();
        gmiEmployeeDefaultPage.manageCustomer.click();
        gmiEmployeeDefaultPage.createNewCustomerButton.click();


    }
    @Given("enter user information")
    public void enter_user_information() {
        gmiEmployeeDefaultPage.setCreateNewCustomer();

    }
    @Then("verify the new user creation is successful")
    public void verify_the_new_user_creation_is_successful() {


    }
    @Then("close the page")
    public void close_the_page() {
        Driver.wait(5);
        Driver.closeDriver();
    }

}
