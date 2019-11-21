import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
        driver.manage().window().maximize();
       /* driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#FH-origin")).sendKeys("nyc");
        driver.findElement(By.cssSelector("#FH-destination")).sendKeys("IAD");
        driver.findElement(By.cssSelector("#FH-fromDate")).sendKeys("11/20/2019");
        driver.findElement(By.xpath("//*[@id=\"gmt\"]")).sendKeys("01/08/2020");*/
        
        
        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.findElement(By.cssSelector("#FH-origin")).sendKeys("nyc");
        driver.findElement(By.cssSelector("#FH-destination")).sendKeys("IAD");
        driver.findElement(By.cssSelector("#FH-fromDate")).sendKeys("11/25/2019");
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("#FH-toDate")).sendKeys("11/29/2019");
        driver.findElement(By.xpath("//*[@id=\"FH-searchButtonExt1\"]")).click();
        
        
      	}
	
	
	
	}
