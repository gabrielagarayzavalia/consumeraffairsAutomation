package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
    public static WebDriver driver;
    public static WebDriverWait wait;
	
	public HomePage(WebDriver driver, String URL) throws Exception  {
    	super(driver, URL);
    	HomePage.driver = driver;
		
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
		HomePage.driver = driver;
	}
	
	
	
	public HomePage visitPage(WebDriver driver, String URL) throws Exception{
		
		HomePage page = new HomePage(driver, URL);
		
		wait = new WebDriverWait(driver,15);
	//	wait.until(ExpectedConditions.urlMatches(URL));
		
		PageFactory.initElements(driver, page);
		
		return page;
		
	}
	
	
    //********* web elements*********
	
	
	String allCategoriesLnk_css = "a.ca-a-prm:nth-child(3)";
	
	
	
	
	   //*********Page Methods*********
	
	
		//navigate to HomePage
		public static void HomePageVisit(WebDriver driver, String URL) {
			driver.get(URL);
		}
	
	
	public void allCategories_Click() {
		click(By.cssSelector(allCategoriesLnk_css));
	}
	
	
	
	
	
	
	

}
