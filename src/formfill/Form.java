package formfill;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
	static WebDriver wd;
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hemant\\\\Downloads\\\\New folder/chromedriver.exe");
	      wd = new ChromeDriver();
	      wd.get("http://www.gcrit.com/build3/create_account.php");
	      Thread.sleep(2000);
	      wd.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
	      wd.findElement(By.name("firstname")).sendKeys("Rajat");
	      wd.findElement(By.name("lastname")).sendKeys("Salvi");
	      wd.findElement(By.id("dob")).sendKeys("11/15/1996",Keys.ENTER);
	      
	     
      
	      ((JavascriptExecutor)wd).executeScript("window.open()");
	      ArrayList<String> tab = new ArrayList<String>(wd.getWindowHandles());
	      wd.switchTo().window(tab.get(1));
	      Thread.sleep(2000);
	    
    
	      
	      wd.get("https://jqueryui.com/droppable/");
	      
	      wd.switchTo().frame(0);
	      
	      WebElement sourceElement = wd.findElement(By.id("draggable"));
	      WebElement destElement = wd.findElement(By.id("droppable"));
	      
	      Actions action = new Actions(wd);
	      action.clickAndHold(sourceElement).moveToElement(destElement).release().build().perform();
	      
	      Thread.sleep(2000);
	      wd.quit();
		}



	}

