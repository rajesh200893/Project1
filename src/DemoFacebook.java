import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver fb = new ChromeDriver();
		fb.get("https://www.facebook.com/"); 
		
	}

}
