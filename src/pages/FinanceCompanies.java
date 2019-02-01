package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class FinanceCompanies extends BasePage{
		
	    public static WebDriver driver;
	    public static WebDriverWait wait;

		public FinanceCompanies(WebDriver driver) {
			super(driver);
			ResourcesAllCategories.driver = driver;
		}
		
		public FinanceCompanies(WebDriver driver, String URL) throws Throwable {
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
		
		String determine_spend_lnk_css = "#choose-lender-content > div:nth-child(1) > p:nth-child(3) > a:nth-child(1)";
			
		String determine_spend_href = "https://www.consumeraffairs.com/finance/how-much-house-can-i-afford.html";
		
		String sendMeAdvice_pup_xp = "//*[@id=\"high_aggression\"]/div";
		
		
		@FindBy(css="#choose-lender-content")
		@CacheLookup
		WebElement chooseContentWE;
		
		//// Methods
		
		
		public void determine_spend_lnk_Click() {
			click(By.cssSelector(determine_spend_lnk_css));
		}
		
		public void determine_spend_href_Click() {
			click(By.linkText(determine_spend_href));
		}

		public WebElement determine_lnk () {
			
			WebElement a = chooseContentWE.findElement(By.cssSelector("div"));
			WebElement b = a.findElement(By.cssSelector("p:nth-child(3)"));
			WebElement lnk = b.findElement(By.tagName("a"));
			//WebElement lnk = c.findElement(By.linkText("https://www.consumeraffairs.com/finance/how-much-house-can-i-afford.html"));//("determine how much you can spend"));
			
			return lnk;
		}
		
		
		
		
		
}
