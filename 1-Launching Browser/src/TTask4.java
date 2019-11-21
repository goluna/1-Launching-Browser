import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class TTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")) .click();
		 String title =driver.getTitle();
		if(title.contains("Find a Flight")) {
			System.out.println(title +" Verified");
		}else {
		System.out.println(title + " Not verified");
		
		
	}
		driver.quit();
}

};