package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String projectloction = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectloction + "/lib/gekodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector("[class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("test1266@test.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Sanjeet");
		driver.findElement(By.id("customer_lastname")).sendKeys("Singh");
		driver.findElement(By.id("passwd")).sendKeys("Mnitbhopal@123");
		//driver.findElement(By.id("uniform-days")).click();
		WebElement staticDropdown=driver.findElement(By.cssSelector("[name='days']"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByValue("21");
		WebElement staticDropmonths=driver.findElement(By.cssSelector("[name='months']"));
		Select months=new Select(staticDropmonths);
		months.selectByValue("9");
		WebElement staticDropyears=driver.findElement(By.cssSelector("[name='years']"));
		Select years=new Select(staticDropyears);
		years.selectByValue("1996");
		driver.findElement(By.cssSelector("[name='company']")).sendKeys("Broadridge Soulution pvt ltd");
		driver.findElement(By.cssSelector("[name='address1']")).sendKeys("XYZ");
		driver.findElement(By.cssSelector("[name='city']")).sendKeys("XYZ");
		WebElement staticDropselect=driver.findElement(By.cssSelector("[name='id_state']"));
		Select state=new Select(staticDropselect);
		state.selectByVisibleText("Alaska");
		driver.findElement(By.id("postcode")).sendKeys("56003");
		WebElement staticDropcountry=driver.findElement(By.cssSelector("[name='id_country']"));
		Select country=new Select(staticDropcountry);
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("578796896");
		driver.findElement(By.id("alias")).sendKeys("Sanj");
		driver.findElement(By.id("submitAccount")).click();
		String signout=driver.findElement(By.cssSelector("[class='logout']")).getText();
		if(signout.contains("Sign out"))
		{
			System.out.println("User Verified,Test case Passed");
		
		}
		else
			System.out.println("User Verification Failed,Test Case Failed");

		
		
		
	}

}
