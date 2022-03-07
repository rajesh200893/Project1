import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMakeMyTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		ChromeDriver mmt = new ChromeDriver();
		mmt.get("https://www.makemytrip.com/"); 
	}

	
}
