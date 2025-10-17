package pages;
import java.time.Duration;
//import java.util.concurrent.TimeoutException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
	 private WebDriver driver;
	 private WebDriverWait wait;
	 //Locators 
	 
	 private By burgerBtn = By.xpath("//button[@aria-label='Main navigation menu']");
	 private By loginOrSignUpBtn = By.xpath("//span[normalize-space()='Log in or sign up']");
	 private By loginOrSignUpBtnHeader = By.xpath("//*[text()=\"Log in or sign up\"]");
	 private By welcomeHeader = By.xpath("//*[text()='Welcome to Airbnb']");
	 private By continueWithEmail = By.xpath("//*[text()='Continue with email']");
	 private By emailIdInput = By.xpath("//input[@placeholder=\"Email\"]");
	 private By continueBtn = By.xpath("//*[text()='Continue']");
	 private By login = By.xpath("//*[text()='Log In']");
	 private By showBtn = By.xpath("//*[text()='Show']");
	 private By passwordInput = By.xpath("//input[@placeholder=\"Password\"]");
	// private By loginOrSignUpBtn = By.xpath("//span[normalize-space()='Log in or sign up']");
	 
	 
	 
	 
	 //Initializing the Page Object with the browser instance and an explicit wait.
	 
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    }
	 
	 
	 public void login(String email, String password) {
	        try {
	            
	            wait.until(ExpectedConditions.elementToBeClickable(burgerBtn)).click();
	            wait.until(ExpectedConditions.elementToBeClickable(loginOrSignUpBtn)).click();
	           // driver.findElement(loginOrSignUpBtnHeader);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeHeader));
	           // driver.findElement(welcomeHeader);
	            driver.findElement(continueWithEmail).click();
	            wait.until(ExpectedConditions.visibilityOfElementLocated(emailIdInput));
	            driver.findElement(emailIdInput).sendKeys(email);
//	            WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
//	            continueButtonElement.click();

	            wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
	            driver.findElement(continueBtn).click();
	            wait.until(ExpectedConditions.visibilityOfElementLocated(login));
	            //driver.findElement(login);
	            //driver.findElement(showBtn);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(showBtn));
	            driver.findElement(passwordInput).sendKeys(password);
	            wait.until(ExpectedConditions.elementToBeClickable(login)).click();

	            System.out.println("✅ Login steps completed (OTP expected next).");

	        } 
	        catch (TimeoutException e) {
	            Assert.fail("TimeoutException: " + e.getMessage());
	        } catch (StaleElementReferenceException e) {
	            Assert.fail("StaleElementReferenceException: " + e.getMessage());
	        } catch (NoSuchElementException e) {
	            Assert.fail("NoSuchElementException: " + e.getMessage());
	        } catch (Exception e) {
	            Assert.fail("Unexpected exception: " + e.getMessage());
	        }
	    }
}
