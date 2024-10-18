package newAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&ec=asw-gmail-globalnav-signin&ddm=0");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		System.out.println("hi");
		email.sendKeys("apatawar2@gmail.com");
		WebElement next = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		next.click();
		

	}

}
