package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FinanceCompanies;
import pages.HomePage;
import pages.LoanApplication;
import pages.MortageCalculator;
import pages.ResourcesAllCategories;

public class HomePageTestCases extends BaseTest  {
	
	public HomePage homePageO;
	public ResourcesAllCategories resourcesO;
	public LoanApplication loanApplicationO;
	public FinanceCompanies finCoO;
	
	
	@Test (priority = 1)
	public void tcHP01_VisitHomePage() throws Throwable {
		
		homePageO = new HomePage(driver, URL);
		
		homePageO.visitPage(driver, URL);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.consumeraffairs.com"));
		
	}
	
	
	@Test (priority = 1)
	public void tcHP02_ViewAllCategories() throws Throwable{
		
		homePageO = new HomePage(driver, URL);
		
		homePageO.visitPage(driver, URL);
		
		homePageO.allCategories_Click();
		
		wait.until(ExpectedConditions.urlContains("/resources/#all-categories"));
		
	}
	
	@Test (priority = 1)
	public void tcHP03_ExpandFinanceCard() throws Throwable{
		
		homePageO = new HomePage(driver, URL);
		
		homePageO.visitPage(driver, URL);
		
		homePageO.allCategories_Click();
		
		wait.until(ExpectedConditions.urlContains("/resources/#all-categories"));
		
		resourcesO = new ResourcesAllCategories (driver);
		
		resourcesO.finance_expand_Click();
		
		
		
	}
	
	@Test (priority = 1)
	public void tcHP04_MortgageLink_Click() throws Throwable{
		
		homePageO = new HomePage(driver, URL);
		
		homePageO.visitPage(driver, URL);
		
		homePageO.allCategories_Click();
		
		wait.until(ExpectedConditions.urlContains("/resources/#all-categories"));
		
		resourcesO = new ResourcesAllCategories (driver);
		
		resourcesO.finance_expand_Click();
		
		resourcesO.mortage_Click();
		
		
		
	}
	
	@Test (priority = 1)
	public void tcHP05_HowToApply_sidebar_Click() throws Throwable{
		
		homePageO = new HomePage(driver, URL);
		
		homePageO.visitPage(driver, URL);
		
		homePageO.allCategories_Click();
		
		wait.until(ExpectedConditions.urlContains("/resources/#all-categories"));
		
		resourcesO = new ResourcesAllCategories (driver);
		
		resourcesO.finance_expand_Click();
		
		resourcesO.mortage_Click();
		
		loanApplicationO = new LoanApplication(driver);
		
		loanApplicationO.loan_apply_lnk_Click();
		
		
	}

	
	@Test (priority = 1, enabled = false)
	public void tcHP06_DetermineHowMuch_link_Click() throws Throwable{
		
		homePageO = new HomePage(driver, URL);
		
		homePageO.visitPage(driver, URL);
		
		homePageO.allCategories_Click();
		
		wait.until(ExpectedConditions.urlContains("/resources/#all-categories"));
		
		resourcesO = new ResourcesAllCategories (driver);
		
		resourcesO.finance_expand_Click();
		
		resourcesO.mortage_Click();
		
		loanApplicationO = new LoanApplication(driver);
		
		loanApplicationO.loan_apply_lnk_Click();
		
		finCoO = new FinanceCompanies(driver);
		
	//	finCoO.determine_spend_href_Click();
		try {
			
			finCoO.determine_lnk().click();
		
		}catch (Exception e) {
			System.out.println("ERROR CATCHED: "+e);
			Assert.fail();
		}

		//TODO = find correct xpath or webelements nesting 
		
	}
	
	@Test (priority = 1, enabled=true)
	public void tcHP07_MortageSection_CreateAssesment() throws Throwable{
		
		String mcURL = "https://www.consumeraffairs.com/finance/how-much-house-can-i-afford.html#calculator";
		
		MortageCalculator mcPage = new MortageCalculator(driver, mcURL);
		
		String amount = "75000";
		mcPage.annualIncome_txt(amount);
		
		String intAmount = "10";
		mcPage.interestRate_txt(intAmount);
		
		String mortgageTerm = "15";
		mcPage.mortagTerm_txt(mortgageTerm);
		
		String downPayment = "57000";
		mcPage.downPaymnt_txt(downPayment);
		
		
	}
	
}
