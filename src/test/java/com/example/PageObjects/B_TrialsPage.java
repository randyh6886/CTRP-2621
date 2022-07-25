package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class B_TrialsPage extends BaseClass {
    // old implementation is below and gave null pointer exception - here is new attempt

    public static WebDriver weBdriver;

    public B_TrialsPage(WebDriver ldriver) {
        this.weBdriver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    public void clickTrialsMenuOption(){
        B_TrialsPage.weBdriver.findElement(By.id("trialSearchMenuOption")).click();
//        WebElement element;
//        element = getDriver().findElement(By.id("trialSearchMenuOption"));
//        element.click();
    }
    public void enterIdentifierType(){
        weBdriver.findElement(By.id("identifierType")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("identifierType"));
            dropdown.findElement(By.xpath("//option[. = 'NCI']")).click();
        }
        weBdriver.findElement(By.id("identifier")).click();
        weBdriver.findElement(By.id("identifier")).sendKeys("NCI-2020-00074");
        weBdriver.findElement(By.cssSelector(".search")).click();
        weBdriver.findElement(By.linkText("NCI-2020-00074")).click();
    }
    public void enterParticipatingSitesInfo(){
        // Step 8
        weBdriver.findElement(By.linkText("Participating Sites")).click();
        //Step 9
        weBdriver.findElement(By.cssSelector(".add")).click();
        //Step 10
        weBdriver.findElement(By.cssSelector(".form:nth-child(2) > tbody > tr > .value .search")).click();
        //Step 13
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.cssSelector(".add")).click();
        //step 14
        weBdriver.findElement(By.id("orgName")).click();
        weBdriver.findElement(By.id("orgName")).sendKeys("Liberty Cancer Care");
        //Step 15
        weBdriver.findElement(By.id("orgAddress")).click();
        //Step 16
        weBdriver.findElement(By.id("orgAddress")).sendKeys("4323 Dulles Dr");
        //steps 17-18
        weBdriver.findElement(By.id("orgCity")).click();
        weBdriver.findElement(By.id("orgCity")).sendKeys("Herndon");
        //Steps 19-20
        weBdriver.findElement(By.id("orgStateSelect")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("orgStateSelect"));
            dropdown.findElement(By.xpath("//option[. = 'VA']")).click();
        }
        //Step21
        weBdriver.findElement(By.id("orgZip")).click();
        weBdriver.findElement(By.id("orgZip")).sendKeys("20171");
        //step 22-23
        weBdriver.findElement(By.cssSelector(".save")).click();
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        //step24-25
        weBdriver.findElement(By.id("recStatus")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("recStatus"));
            dropdown.findElement(By.xpath("//option[. = 'Active']")).click();
        }
        //step 26
        weBdriver.findElement(By.cssSelector(".calendaricon")).click();

        weBdriver.findElement(By.linkText("28")).click();
        weBdriver.close();
        //Step 27
        weBdriver.findElement(By.cssSelector(".actionsrow:nth-child(5) .save")).click();
    }
    public void enterInvestigatorsInfo(){
        //Step 28
        weBdriver.findElement(By.linkText("Investigators")).click();
        // Step 29
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.switchTo().frame(2);
        // step 30
        weBdriver.findElement(By.id("personFirstName")).click();
        weBdriver.findElement(By.id("personFirstName")).sendKeys("J");
        weBdriver.findElement(By.cssSelector(".line")).click();
        //Step 31
        weBdriver.findElement(By.cssSelector(".search")).click();
        //Step 32
        weBdriver.findElement(By.cssSelector(".odd:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        //Step 33
        weBdriver.findElement(By.linkText("Contact")).click();
        // Step 34
        weBdriver.findElement(By.cssSelector(".search")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("personFirstName")).click();
        weBdriver.findElement(By.id("personFirstName")).sendKeys("J");
        weBdriver.findElement(By.cssSelector(".search")).click();

        weBdriver.findElement(By.cssSelector(".odd:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();

        //Step 35
        weBdriver.findElement(By.cssSelector(".actionsrow:nth-child(3) .save")).click();
        //Step 36
        weBdriver.findElement(By.linkText("Participating Site")).click();
        //Step 37
        weBdriver.findElement(By.cssSelector(".actionsrow:nth-child(5) .save")).click();
    }
    public void enterGeneralTrialDetails(){
        // Step 38
        weBdriver.findElement(By.linkText("General Trial Details")).click();
        weBdriver.findElement(By.cssSelector("#loadOrgField .organization")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("orgNameSearch")).click();
        weBdriver.findElement(By.id("orgNameSearch")).sendKeys("Mayo");
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .search")).click();
        weBdriver.findElement(By.cssSelector(".odd:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.cssSelector("#loadSponsorField .organization")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("orgNameSearch")).click();
        weBdriver.findElement(By.id("orgNameSearch")).sendKeys("Mayo");
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .search")).click();
        weBdriver.findElement(By.cssSelector(".odd:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();

        weBdriver.findElement(By.cssSelector("#loadCentralContactDiv .btn:nth-child(1) > .btn_img")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("personFirstName")).click();
        weBdriver.findElement(By.id("personFirstName")).sendKeys("J");
        weBdriver.findElement(By.cssSelector(".search")).click();
        weBdriver.findElement(By.cssSelector(".odd:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.id("gtdDTO.centralContactEmail")).click();
        weBdriver.findElement(By.id("gtdDTO.centralContactEmail")).sendKeys("mayo@gmail.com");
        weBdriver.findElement(By.id("gtdDTO.centralContactPhone")).click();
        weBdriver.findElement(By.id("gtdDTO.centralContactPhone")).sendKeys("7032432233");
        weBdriver.findElement(By.cssSelector(".actionsrow .save")).click();
        weBdriver.findElement(By.cssSelector(".actionstoprow .save")).click();
    }
}
