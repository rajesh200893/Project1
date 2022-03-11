import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //method chaining 
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
}
}
