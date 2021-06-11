package GitHubtest1.GitHubtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogin 
{
	public WebDriver driver;
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		//maximizing the screeen1
	}
	
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("tyagivivek21@yahoo.co.in");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
	}

	public static void main(String[] args) {

		fbLogin l= new fbLogin();
		l.Setup();
		l.login();
	}


}
