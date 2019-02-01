package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoanApplication extends BasePage{
	
    public static WebDriver driver;
    public static WebDriverWait wait;

	public LoanApplication(WebDriver driver) {
		super(driver);
		ResourcesAllCategories.driver = driver;
	}
	
	public LoanApplication(WebDriver driver, String URL) throws Throwable {
		super(driver, URL);
		ResourcesAllCategories.driver = driver;
	}
	
	public ResourcesAllCategories ResourcesPage (WebDriver driver, String URL) throws Throwable {
		
		ResourcesAllCategories page = new ResourcesAllCategories(driver, URL);
		
		wait = new WebDriverWait(driver,15);
		
		PageFactory.initElements(driver, page);
		
		return page;
	}
	
	////WebElements strings
	
	String loan_apply_lnk_css = "a.aside-nav__item:nth-child(3)";
	
	
	
	//// Methods
	
	
	public void loan_apply_lnk_Click() {
		click(By.cssSelector(loan_apply_lnk_css));
	}
	

	

}
