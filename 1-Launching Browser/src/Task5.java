import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
		driver.manage().window().maximize();
	String text  = driver.findElementByCssSelector("float.bold").getText();
	System.out.println(text);
	driver.findElement(By.id("login")).sendKeys("hyasini");
	driver.findElement(By.name("login")).getAttribute("value");
	driver.findElement(By.id("proced")).sendKeys("hyasini");
	}

}
