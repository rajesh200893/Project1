import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //method chaining 
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		//driver.close();
	    //driver.quit();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();		
		
	    
	    
	// what is difference between close() and quite() ?
	//how to maximise the brower?
		//what is difference bet get() and to()
		   
	}  
 
}
