package newAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAC {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		
		WebElement createAccount = driver.findElement(By.xpath("(//div[@class='dropdown__label'])[1]"));
		//createAccount.click();  dropdown is coming
		
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signIn.click();
		
		Thread.sleep(1000);
		
		WebElement chooseAnotherAc = driver.findElement(By.xpath("(//div[@class='VV3oRb YZVTmd SmR8'])[2]"));
		Thread.sleep(1000);
		chooseAnotherAc.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		
		email.sendKeys("apatawar2@gmail.com");
	}

}
