package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class github {
	
	@Test
	public class githubdemo {
		
		public void dropdown() throws InterruptedException
		{
			

			WebDriver driver ; 
			
			System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe") ;
			driver = new ChromeDriver();
			 
			driver.manage().window().maximize();
			
			driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		    driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

			 WebDriverWait wait = new WebDriverWait(driver, 20);

			 
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

			
			boolean status = element.isDisplayed();

		 
			if (status) 
			{
				System.out.println("===== WebDriver is visible======");
			} 
			
			else 
			{
				System.out.println("===== WebDriver is not visible======");
			}

		}

	}
	 

}
