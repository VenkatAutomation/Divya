package LoginModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
        
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.linkText("Create your Amazon account")).click();
		driver.navigate().back();
		
		driver.findElement(By.id("ap_email")).sendKeys("venkatramana40533@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		
		
		
	}

}
