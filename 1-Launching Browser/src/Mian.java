import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Mian {

	public static void main(String[] args) {
		
		
		
			System.setProperty("webdriver.chrome.driver", "../chromedriver");
			ChromeDriver driver = new ChromeDriver();
		
        driver.get("https://www.cnn.com");
        String Title = driver.getTitle();
        System.out.println(Title);
        
        if(Title.contains("Breaking")) {
        	System.out.println("verified");
	}else {
		System.out.println("not verified");
           //System.out.println( driver.getCurrentUrl());
		//driver.get("https://www.facebook.com");
		/*driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();*/
		
		driver.close();
		driver.quit();
	}
	}
	};

