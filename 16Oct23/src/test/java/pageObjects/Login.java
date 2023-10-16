package pageObjects;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
WebDriver driver;	

	@FindBy(xpath="//*[@id='orgId']")
	WebElement companyId;
	
	@FindBy(xpath="//*[@id='userId']")
	WebElement userId;
	
	@FindBy(xpath="//*[@id='signin']")
	WebElement continue1;
	
	@FindBy(xpath="//*[@id='secretCode']")
	WebElement pwd1;
	
	@FindBy(xpath="//*[@id='signin']")
	WebElement signin;
	
	@FindBy(xpath="//div[@class='mat-menu-content']//span[text()='ACH']")
	WebElement ACH;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']//span[text()='Money Movement']")
	WebElement moneyMovement;
	
	@FindBy(xpath="//*[@class='post-title']")
	WebElement successMessage;
	
	public  Login(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}
	
//public void setcompanyID(String companyId) {
//	companyId.sen		
//	}

	
public void continues() {		
	continue1.click();
		
	}

public void enterPassword(String pwd) {		
pwd1.sendKeys(pwd);
signin.click();
		
	}

public void login(String c, String d) {
	System.out.println("------------------------------------login success message:	");
	companyId.sendKeys(c);
	userId.sendKeys(d);
	
}


public void clickOnMoneyMovement() throws InterruptedException {
	Actions a=new Actions(driver);
	a.moveToElement(moneyMovement).build().perform();
//	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//	 while (!isDisplayed(ACH)) 
//	    {
//	        Thread.sleep(3000);
//	        System.out.println("Element is not visible yet");
//	    }
//	    return ACH;
//
//	    }
//	    public static boolean isDisplayed(WebElement ACH) {
//	        try {
//	            if(ACH.isDisplayed())
//	                return ACH.isDisplayed();
//	            }catch (NoSuchElementException ex) {
//	            return false
//	            		;
//	        }
//	        return false;
//	    }
	//wait.until(ExpectedConditions.visibilityOf(ACH));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(ACH));
	ACH.click();
	
}
	
}