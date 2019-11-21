import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.dice.com/");
		driver.get("http://www.indeed.com/");
		driver.navigate().back();
		String title =driver.getTitle();
		String currenturl = driver.getCurrentUrl();
		System.out.println(title + currenturl);
		driver.navigate().forward();
		String title1 = driver.getTitle();
		String currenturl1 = driver.getCurrentUrl();
		System.out.println(title + currenturl1);
		driver.close();
		driver.quit();

	}

}
