package com.example.Steps;

import com.example.Base.BaseClass;
import com.example.PageObjects.A_LoginPage;
import com.example.PageObjects.B_TrialsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class OrgPersonTrial extends BaseClass {
    static WebDriver driver;

    @Before
    public void setup() throws Exception{
        System.setProperty("webdriver.chrome.driver","chromedriver 4.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    @Given("^Open Chrome and launch application$")
    public void open_chrome_and_launch_application() throws Throwable{
        System.setProperty("webdriver.chrome.driver","chromedriver 4");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        driver=new ChromeDriver();
        driver.get("https://trials-int.nci.nih.gov/");
        Thread.sleep(3000);
    }

    @When("^I enter Username and password")
    public void i_enterusername_and_password() throws Throwable{
        A_LoginPage loginPage=new A_LoginPage(driver);
        Thread.sleep(3000);
        loginPage.setUserName();
        loginPage.setPassword();
    }

    @When("^the website opens$")
    public void the_website_opens() throws Throwable{
        A_LoginPage loginPage=new A_LoginPage(driver);
        loginPage.clickSigninSubmit();
        Thread.sleep(4000);
    }

    @When("^I click on Protocol Abstraction$")
    public void i_click_on_protocol_abstraction() throws Throwable
    {
        A_LoginPage loginPage=new A_LoginPage(driver);
        loginPage.clickProtocolAbstraction();
        loginPage.clickAccept();
        Thread.sleep(4500);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        //webdriver.quit();
//        objTrialsPage=new B_TrialsPage(driver);
//        objTrialsPage.clickTrialsMenuOption();
    }

   
    @Given("^I click on trials menu option$")
    public void iClickOnTrialsMenuOption() throws Throwable{

        B_TrialsPage trialsPage= new B_TrialsPage(driver);
        //B_TrialsPage objTrialsPage=new B_TrialsPage(webDriver);

        //B_TrialsPage.clickTrialsMenuOption(driver).click();
        //trialsPage = (B_TrialsPage) getDriver();

        trialsPage.clickTrialsMenuOption();
        //objTrialsPage.clickTrialsMenuOption();
    }


    @When("I enter identifier type")
    public void iEnterIdentifierType() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterIdentifierType();
    }

    @Then("I enter participating sites info")
    public void iEnterParticipatingSitesInfo() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterParticipatingSitesInfo();
    }

    @Then("I enter investigators info")
    public void iEnterInvestigatorsInfo() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterInvestigatorsInfo();
    }

    @Then("I enter general trial details")
    public void iEnterGeneralTrialDetails() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterGeneralTrialDetails();
    }
}
