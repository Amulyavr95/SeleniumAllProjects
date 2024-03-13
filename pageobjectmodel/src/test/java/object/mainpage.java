package object;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.Checkbox;
import test.Download;


public class mainpage {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test
	public void downlod() {
		Download d= new Download(driver);
		d.getfiledownloadlink();
		d.getdownloadlink();
	}
	@Test
	public void checkboxes() {
		Checkbox cb=new Checkbox(driver);
		cb.getCheckboxlink();
		cb.getchecklink();
	}
}
