package dhiofur.texrootsourcing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FigmaDesign {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		
		driver.get("https://dhiofur.texrootsourcing.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Homepage() {
		
	   String Exp_TITLE="Home page -Dhiofur";
		
		WebElement HomeButton= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[1]/a/span"));
		
		if (HomeButton.isDisplayed() && HomeButton.isEnabled());
		HomeButton.click();
		String act_title=driver.getTitle();
		Assert.assertEquals(Exp_TITLE, act_title);
		
	}
	
	@Test
	public void AboutUS() {
		
		
		WebElement about= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[2]/a/span"));
	    if(about.isDisplayed() && about.isEnabled()) {
	    	about.click();
	    }
	    String exp_text="Company Funding Story";
	    String act_text= driver.findElement(By.xpath("/html/body/div[3]/section[2]/div[1]/div/div[1]")).getText();
	    Assert.assertEquals(exp_text, act_text);
	}
	
	@Test
	public void servicesAir() {
		
		WebElement serv= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[3]/a/span"));
		
		if(serv.isDisplayed()&& serv.isEnabled()) {
			serv.click();
		}
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 WebElement button =driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/div/div[1]/div/div[2]/a"));
		
		 js.executeScript("arguments[0].click();",button);
		
		
		
		
		String exp_text="Domestic and international ticket contact details Panel";
		String act_text=driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/h3")).getText();
		Assert.assertEquals(exp_text, act_text); 
	}
	
	@Test
	public void ServicesHajj() {
		
        WebElement serv= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[3]/a/span"));
		
		if(serv.isDisplayed()&& serv.isEnabled()) {
			serv.click();
		}
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 WebElement button =driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/div/div[2]/div/div[2]/a"));
		
		 js.executeScript("arguments[0].click();",button);
		
		 String exp_text="Domestic and international ticket contact details Panel";
		String act_text=driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/h3")).getText();
		Assert.assertEquals(exp_text, act_text);
		
	}
	@Test
	public void servicestourpack() throws InterruptedException {
		WebElement serv= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[3]/a/span"));
		
		if(serv.isDisplayed()&& serv.isEnabled()) {
			serv.click();
		}
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 WebElement button =driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/div/div[3]/div/div[2]/a"));
		
		 js.executeScript("arguments[0].click();",button);
		 
		 Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//*[@id=\"profile-tab\"]")).click();
	JavascriptExecutor js1= (JavascriptExecutor)driver;
    WebElement button1 =driver.findElement(By.xpath("/html/body/div[3]/section[3]/div/div[2]/div[1]/div[2]/div[3]/div[2]/a"));
	js1.executeScript("arguments[0].click();",button1);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"profile-tab\"]")).click();
    driver.findElement(By.xpath("/html/body/div[3]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/button[5]")).click();
    driver.findElement(By.xpath("/html/body/div[3]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/input")).sendKeys("ABC");
    driver.findElement(By.xpath("/html/body/div[3]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/input")).sendKeys("abc@abc.com");
    driver.findElement(By.xpath("/html/body/div[3]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/div[4]/input")).sendKeys("very good");
    driver.findElement(By.xpath("/html/body/div[3]/section/div/div/div[2]/div[2]/div[2]/div[3]/div/div[5]/a")).click();
	
	}
	
	@Test
	public void VisaService() {
		
   WebElement serv= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[3]/a/span"));
		
		if(serv.isDisplayed()&& serv.isEnabled()) {
			serv.click();
		}
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 WebElement button =driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/div/div[4]/div/div[2]/a"));
		
		 js.executeScript("arguments[0].click();",button);
		
	}
	
	@Test
	public void Concern() {
      WebElement con= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[4]/a/span"));
		
		if(con.isDisplayed()&& con.isEnabled()) {
			con.click();
		}
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 WebElement button =driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[1]/div/div/div[2]/div[2]/a"));
		
		 js.executeScript("arguments[0].click();",button);
		
	}
	
	@Test
	public void Blog() {
		 WebElement blog= driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div/div/div[2]/nav/ul/li[5]/a/span"));
			
			if(blog.isDisplayed()&& blog.isEnabled()) {
				blog.click();
			}
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			 WebElement button =driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[1]/div[2]/div/div/div/a[2]"));
			
			 js.executeScript("arguments[0].click();",button);
		
	}
	
	@Test
	public void ContactUs() {
      WebElement blog= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[8]/a/span"));
		
		if(blog.isDisplayed()&& blog.isEnabled()) {
			blog.click();
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[2]/div[1]/form/div/div[1]/input")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[2]/div[1]/form/div/div[2]/input")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[2]/div[1]/form/div/div[3]/input")).sendKeys("12212");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[2]/div[1]/form/div/div[4]/textarea")).sendKeys("very good");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[2]/div[1]/form/div/button")).click();	
		
		
	}
	
	@Test
	 public void Immigration() throws InterruptedException {
		Actions act= new Actions(driver);
		Thread.sleep(1000);
		
		WebElement switchTo= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[9]/a/span"));
        WebElement Alert= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[9]/ul/li[1]/a/span"));
        Thread.sleep(1000);
	    act.moveToElement(switchTo).build().perform();
	   
	    Thread.sleep(1000);
	    act.moveToElement(Alert).click().build().perform();
	    Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[1]/input")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[2]/input")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[3]/input")).sendKeys("12212");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[4]/textarea")).sendKeys("very good");
		driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/button")).click();	
		
		
	}
	    @Test
    	public void Student() throws InterruptedException {
	    	Actions act= new Actions(driver);
			Thread.sleep(1000);
			
			WebElement switchTo= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[9]/a/span"));
	        WebElement Alert= driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div/div/div[2]/nav/ul/li[9]/ul/li[2]/a/span"));
	        Thread.sleep(1000);
		    act.moveToElement(switchTo).build().perform();
		   
		    Thread.sleep(1000);
		    act.moveToElement(Alert).click().build().perform();
		    Thread.sleep(10000);
			
			driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[1]/input")).sendKeys("abc");
			driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[2]/input")).sendKeys("abc@abc.com");
			driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[3]/input")).sendKeys("12212");
			driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/div[4]/textarea")).sendKeys("very good");
			driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div/div[2]/form/div/button")).click();	
			
			
		
	}
	
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
