import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookflight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hotwire.com/flights/?gclid=Cj0KCQiAn8nuBRCzARIsAJcdIfPZChO4fq8G9Kdk_L1TGGWqAnH6aNEtn72zSgWcyBSj0SjTKmhCIsUaAn-4EALw_wcB");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body[1")).sendKeys("SFO");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[1]/farefinder-flight/div/form/div[3]/div/info")).sendKeys("JFK");
        driver.findElement(By.xpath("]")).sendKeys("11/18/2019");
        driver.findElement(By.xpath("//*[@id=\"farefinder-flight-enddate-input\"]")).sendKeys("01/08/2020");
        driver.findElement(By.xpath("//*[@id=\"farefinder-flight-search-button\"]")).click();

	}

}
