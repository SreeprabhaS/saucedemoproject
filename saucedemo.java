package Seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\eclipse-workspace\\Selenium\\src\\Seleniumjava\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
        
        WebElement dropdown= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        dropdown.click();
        
        
     Select obj= new Select(dropdown);
	
		obj.selectByVisibleText("Price (low to high)");
		
		WebElement addToCartButton1=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		addToCartButton1.click();
		
		WebElement addToCartButton2=driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		addToCartButton2.click();
		
		WebElement addToCartButton3=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		addToCartButton3.click();
		
		WebElement addToCartButton4=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		addToCartButton4.click();
		
		WebElement addToCartButton5=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCartButton5.click();
		
		WebElement addToCartButton6=driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		addToCartButton6.click();
		
	
		WebElement cartbutton=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cartbutton.click();
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 1500)");
		 
		 
		
		WebElement removeitem1=driver.findElement(By.id("remove-sauce-labs-bike-light"));
		removeitem1.click();
		
		
		WebElement removeitem2=driver.findElement(By.id("remove-sauce-labs-onesie"));
		removeitem2.click();
		
		
		driver.findElement(By.id("checkout")).click();
		
		
		driver.findElement(By.name("firstName")).sendKeys("Sreeprabha");
		driver.findElement(By.name("lastName")).sendKeys("S");
		driver.findElement(By.name("postalCode")).sendKeys("695581");
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("finish")).click();
		
		//driver.navigate().refresh();
		driver.findElement(By.id("back-to-products")).click();
		
		
	WebElement menu=driver.findElement(By.className("bm-burger-button"));
	menu.click();
	
	
	WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
	logout.click();
	
	driver.close();

	
		
		
		
		
	}

}
