import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		ChromeDriver automation = new ChromeDriver();
		automation.get("http://automationpractice.com/index.php"); 
	}

}
