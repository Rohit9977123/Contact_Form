package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://cart.com/contact/sales");
  driver.manage().window().maximize();
  
   driver.findElement(By.name("firstname")).sendKeys("Rohit");
   driver.findElement(By.name("lastname")).sendKeys("Chouhan");
   driver.findElement(By.name("phone")).sendKeys("9977840383");
   driver.findElement(By.name("email")).sendKeys("rohitchouhankgn11@gmail.com");
   driver.findElement(By.name("company")).sendKeys("Amazon");
   Thread.sleep(2000);
   
   
   // Click on the dropdown to open options
   WebElement dropdown1 = driver.findElement(By.cssSelector("[name='country']"));
   
   
   Select optionIndia = new Select(dropdown1);

	  // Step 2 - Use the methods available in Select class to select an option in the dropdown
	 
	  optionIndia.selectByVisibleText("India");
	   Thread.sleep(2000);
   
	  
	  driver.findElement(By.cssSelector("[value='Fulfillment']")).click();
	  driver.findElement(By.cssSelector("[value='Feed Marketing']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[value='Storefront']")).click();
	 driver.findElement(By.cssSelector("[value='Marketplace Services']")).click();
	 Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[value='Ecommerce Optimization']")).click();
	  driver.findElement(By.cssSelector("[value='OMS / WMS']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[value='Marketplace Management']")).click();
	  driver.findElement(By.cssSelector("[value='Growth Marketing']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[value='Customer Engagement']")).click();
	  driver.findElement(By.cssSelector("[value='Inventory and Demand AI']")).click();
	  Thread.sleep(2000);
	    
      // 3. Add a message in the additional comments text area
	  driver.findElement(By.id("contant_message-dac8341c-befa-4b14-af02-786eba6a50dd_3409")).sendKeys("all process is done by me");
	  
	  
	  
	  driver.findElement(By.id("i_agree_to_the_terms_of_service-dac8341c-befa-4b14-af02-786eba6a50dd_3409")).click();
	  // click a submit 
	  driver.findElement(By.cssSelector("[type='submit'][value='Submit']")).click();
    
	  
	}

}
