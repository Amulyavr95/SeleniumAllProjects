package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {

	ChromeDriver driver;
	
	public Checkbox(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		@FindBy(linkText="Checkboxes")
		private WebElement Checkboxlink;
		
		public void getCheckboxlink() {
			Checkboxlink.click();
		}
		
		@FindBy(css="input[type='checkbox']")
		private WebElement check;
		
		public void getchecklink() {
			check.click();
		}
	
}
