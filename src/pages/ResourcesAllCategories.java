package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResourcesAllCategories extends BasePage{
	
    public static WebDriver driver;
    public static WebDriverWait wait;

	public ResourcesAllCategories(WebDriver driver) {
		super(driver);
		ResourcesAllCategories.driver = driver;
	}
	
	public ResourcesAllCategories(WebDriver driver, String URL) throws Throwable {
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
	
	String finance_expand_css = "div.card-grd__col:nth-child(8) > a:nth-child(1)";
	
	String mortage_css = ".topic_34 > div:nth-child(11) > a:nth-child(1) > span:nth-child(1)";
	
	
	
	
	//// Methods
	
	
	public void finance_expand_Click() {
		click(By.cssSelector(finance_expand_css));
	}
	
	public void mortage_Click() {
		click(By.cssSelector(mortage_css));
	}
	
	

}
