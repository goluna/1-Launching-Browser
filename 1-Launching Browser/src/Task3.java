import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		String title = driver.getTitle();
		if(title.contains("Computer")){
			System.out.println("verified");
		}else
		System.out.println("Not verified");
	
	      driver.close();
driver.quit();
}
}