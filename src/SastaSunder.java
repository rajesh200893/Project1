import org.openqa.selenium.chrome.ChromeDriver;

public class SastaSunder {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			ChromeDriver sastaSunder = new ChromeDriver();
			sastaSunder.get("https://www.sastasundar.com/");
	}

}
