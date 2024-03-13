package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	ChromeDriver driver;
	public Download(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="File Download")
	private WebElement filedownloadlink;
	
	public void getfiledownloadlink() {
		filedownloadlink.click();
	}
	
	@FindBy(linkText="anydesk id.txt")
	private WebElement downloadlink;
	
	public void getdownloadlink() {
		downloadlink.click();
	}
}
