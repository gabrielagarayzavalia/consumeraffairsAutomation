package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class MortageCalculator extends BasePage {
		
	    public static WebDriver driver;
	    public static WebDriverWait wait;
		
		public MortageCalculator(WebDriver driver, String URL) throws Exception  {
	    	super(driver, URL);
	    	MortageCalculator.driver = driver;
			
		}
		
		public MortageCalculator(WebDriver driver) {
			super(driver);
			MortageCalculator.driver = driver;
		}
		
		
		
		public MortageCalculator visitPage(WebDriver driver, String URL) throws Exception{
			
			MortageCalculator page = new MortageCalculator(driver, URL);
			
			wait = new WebDriverWait(driver,15);
		//	wait.until(ExpectedConditions.urlMatches(URL));
			
			PageFactory.initElements(driver, page);
			
			return page;
			
		}
		
		
	    //********* web elements*********
		
		
		String annualIncome_clss = "current_val_annual";
		String  interestRate_clss = "retirement_val";
		String downPaymnt_name = "down_payment";
		String mortagTerm_name = "mortgage_term";
		String state_clss = "";
		
		
		
		   //*********Page Methods*********
		
		
			//navigate to HomePage
			public static void MortageCalculatorVisit(WebDriver driver, String URL) {
				driver.get(URL);
			}
		
		
		public void annualIncome_txt(String amount) {
			writeText(By.className(annualIncome_clss),amount);
		}
		
		public void interestRate_txt(String amount) {
			writeText(By.className(interestRate_clss),amount);
		}
		
		
		public void downPaymnt_txt(String amount) {
			writeText(By.name(downPaymnt_name),amount);
		}
		
		public void mortagTerm_txt(String amount) {
			writeText(By.name(mortagTerm_name),amount);
		}
	

}
