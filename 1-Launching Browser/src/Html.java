import org.openqa.selenium.chrome.ChromeDriver;

public class Html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        driver.close();

	}

}
