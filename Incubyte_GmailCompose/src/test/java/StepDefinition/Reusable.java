package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {
  
 WebDriver driver;
 WebDriverWait wait;
	
private static Reusable instance;

 public static Reusable getinstance() {
  if(instance == null) {
	  instance = new Reusable(); 
  }
    return instance;
 }
	
	public void openbrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.gmail.com");	
	}
	
	public void email_ID(String email) {
		wait = new WebDriverWait(driver, 10);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='identifierId']")));
	       driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(email);
	       driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	public void password(String pass) {
		wait = new WebDriverWait(driver, 10);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))); 
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	       driver.findElement(By.xpath("//span[text()='Next']")).click(); 
	}
	
	public void compose() {
		  wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Compose']")));
	      driver.findElement(By.xpath("//*[text()='Compose']")).click();
	}
	
	public void emailID_To(String toField) {
		   wait = new WebDriverWait(driver, 10);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='to']")));
	       driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(toField);
	}
	
	public void subject(String sub) {
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sub);
	}
	
	public void messagebody(String message) {
		driver.findElement(By.xpath(" //div[@aria-label='Message Body']")).sendKeys(message);
	}
	
	public void sendBtn() {
		driver.findElement(By.xpath("//*[text()='Send']")).click();
	}
	
	
	
}
