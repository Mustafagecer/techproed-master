package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIEmployeeDefaultPage {

    public WebDriver driver;



    public GMIEmployeeDefaultPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "entity-menu")
    public WebElement myOperationDropDown;

    @FindBy(xpath = "//span[contains(text(),'Manage Customers')]")
    public WebElement manageCustomer;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewCustomerButton;

    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement ssnBox1;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement searchButton;
    @FindBy(name="firstName")
    public WebElement firstname;
    @FindBy(name="lastName")
    public WebElement lastname;
    @FindBy(name="middleInitial")
    public WebElement middleInitial;
    @FindBy(name="email")
    public WebElement email;
    @FindBy(name="mobilePhoneNumber")
    public WebElement mobilePhoneNumber;
    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(name="zipCode")
    public WebElement zipCode;
    @FindBy(name="address")
    public WebElement address;
    @FindBy(name="city")
    public WebElement city ;
    @FindBy(id = "tp-customer-ssn")
    public WebElement ssn2;
    @FindBy(name="createDate")
    public WebElement createDate;
    @FindBy(id="tp-customer-country")
    public WebElement countryDropdown;
    @FindBy(id="tp-customer-state")
    public WebElement state;
    @FindBy (id="tp-customer-user")
    public  WebElement userDrop;
    @FindBy(id = "tp-customer-account")
    public WebElement accountDropdown;
    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledCheckbox;
    @FindBy(id = "cancel-save")
    public WebElement backButton;
    @FindBy(id="save-entity")
    public WebElement saveButton;

    public void setCreateNewCustomer(){

        GMIEmployeeDefaultPage gmiEmployeeDefaultPage=new GMIEmployeeDefaultPage();
        Faker faker = new Faker();
        gmiEmployeeDefaultPage.ssnBox1.sendKeys(faker.idNumber().ssnValid());
        gmiEmployeeDefaultPage.firstname.sendKeys(faker.name().firstName());
        gmiEmployeeDefaultPage.lastname.sendKeys(faker.name().lastName());
        gmiEmployeeDefaultPage.middleInitial.sendKeys(faker.name().nameWithMiddle());
        gmiEmployeeDefaultPage.email.sendKeys(faker.internet().emailAddress());
        gmiEmployeeDefaultPage.mobilePhoneNumber.sendKeys("111-111-1111");
        gmiEmployeeDefaultPage.phoneNumber.sendKeys("111-111-1111");
        gmiEmployeeDefaultPage.zipCode.sendKeys(faker.address().zipCode());
        gmiEmployeeDefaultPage.address.sendKeys(faker.address().fullAddress());
        gmiEmployeeDefaultPage.city.sendKeys(faker.address().city());
        gmiEmployeeDefaultPage.ssn2.sendKeys(faker.idNumber().ssnValid());
        gmiEmployeeDefaultPage.countryDropdown.sendKeys("Poland"+ Keys.ENTER);
        gmiEmployeeDefaultPage.state.sendKeys(faker.address().state());
        gmiEmployeeDefaultPage.userDrop.sendKeys("tom"+Keys.ENTER);
        gmiEmployeeDefaultPage.zelleEnrolledCheckbox.click();
        gmiEmployeeDefaultPage.saveButton.click();
    }

    }

