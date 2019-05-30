package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstClass {
	


	public static  void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\selenium\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.onlinesbi.com/#");
		
		WebElement e =driver.findElement(By.xpath("//*[@id=\"primary_navigation\"]/li[6]/a"));
		
		e.click();
		
		String s =driver.getWindowHandle();
		System.out.println(s);
		
		
		
  Set<String> a =driver.getWindowHandles();

for (String v : a ) {
	
	if(!(v.equals(s)));

driver.switchTo().window(v);

}

WebElement e1 =driver.findElement(By.xpath("//*[@id=\"welcomecollect_english\"]/div[2]/button"));

e1.click();




driver.close();

driver.quit();
     			
	}

	
		
	}

	

