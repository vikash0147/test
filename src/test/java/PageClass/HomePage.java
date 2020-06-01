package PageClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	
	@FindBy(xpath ="//ul[contains(@class,'lobNavigationFormWithTabs')]//span[text()='Flights']")
	public WebElement flight;
	
	@FindBy(xpath ="//img[@alt = 'expedia logo']")
	public WebElement logo;
	
	@FindBy(xpath ="//*[contains(@type,'email')]")
	public WebElement emailLogin;
	
	@FindBy(xpath="//ul[@role ='tablist']//span[text()='One-way']")	
	public WebElement oneway;
	
	@FindBy(xpath="//button[@aria-label= 'Flying from']")
	WebElement flyfrom;
	
	@FindBy(xpath="//button[@aria-label= 'Flying to']")
	WebElement flyto;
	
	@FindBy(xpath="//input[@placeholder='City or airport']")
	WebElement flyfrominputbox;
	
	@FindBy(xpath="//input[@placeholder='City or airport']")
	WebElement flytoinputbox;
	
	@FindBy(xpath="//ul[@class='uitk-typeahead-results no-bullet']//li//button//span//strong")
	List<WebElement> cityResults;
	
	@FindBy(xpath="//div[@role='dialog']")
	 public WebElement flyingFromDialog;
	
	@FindBy(xpath="//div/label[text()='Travellers']//following-sibling:: button[ contains(text(),'1 traveller')]")
	 public WebElement travelnum;
	
	@FindBy(xpath="//div[@class='uitk-flex uitk-flex-align-items-center uitk-flex-justify-content-space-between uitk-step-input adultStepInput uitk-step-input-mounted']//button[2]//*[local-name()='svg']")
	
	public WebElement adultadd;
	
	@FindBy(xpath="//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-flex-shrink-0 uitk-toolbar-button']//*[local-name()='svg']")
	public WebElement adultaddclose;
	
	@FindBy(xpath="//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating']")
	 public WebElement tavellerdone;
	
	
	
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clcikOnFlight() {
		System.out.println(flight.getText());
		flight.click();
		
	}
	
	public void entermail() {
		emailLogin.sendKeys("vikash00147@gmail.com");

	}

	public void clcikOnOneWay() {
		System.out.println(oneway.getText());
		oneway.click();
	}
	
	public void flyfrom() {
		System.out.println(flyfrom.getText());
		flyfrom.click();
	}
	
	public void flyto() {
		System.out.println(flyto.getText());
		flyto.click();
	}
	
	public void flyfrominputbox( String val) {
		System.out.println(flyfrominputbox.getText());
		flyfrominputbox.sendKeys(val);
	}
	
	public void flytoinputbox( String val) {
		System.out.println(flytoinputbox.getText());
		flytoinputbox.sendKeys(val);
	}
	
	public void travelnum() {
		System.out.println(travelnum.getText());
		travelnum.click();
	}
	
	public void adultadd(int i) throws InterruptedException {
		for (int j=0; j<i-1;j++) {
			adultadd.click();
			Thread.sleep(2000);
			
		}}
		
		public  void adultaddclose() {

			adultaddclose.click();
		}
		
		
		public void tavellerdone() {
			tavellerdone.click();
		}
	
	
	
	public void selectCityResult(String value) {
		for(WebElement cityResult:cityResults) {
			if(cityResult.getText().contains(value)) {
				cityResult.click();
				break;
			}
		}
	}
	
}







