import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNaukri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver naukri = new ChromeDriver();
		naukri.get("https://www.naukri.com/"); 
	}

}
