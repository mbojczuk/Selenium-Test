package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) throws InterruptedException
	{
		/*//declare and instatiate object/var
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MichaelBojczuk\\Documents\\Java\\geckodriver.exe");
		System.out.println("opening FireFox");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MichaelBojczuk\\Documents\\Java\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle = "";
		
		System.out.println(baseUrl);
		
		//launch FireFox and direct it to the Base URL
		driver.get(baseUrl);
		
		//get the actual value of the title
		actualTitle = driver.getTitle();
		
		//compare the titles
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("test Passed!");
		}
		else
		{
			System.out.println("Test Failesd!");
		}
		
		//close firefox
		driver.close();*/
		
		//ANOTHER TEST//
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\MichaelBojczuk\\Documents\\Java\\geckodriver.exe");
		//create instance firefox driver
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MichaelBojczuk\\Documents\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//open homepage
		driver.get("http://www.indeed.co.uk");
		//find what field and enter selenium
		//if we want it slower
		Thread.sleep(2000);
		driver.findElement(By.id("text-input-what")).sendKeys("Selenium");
		Thread.sleep(2000);
		//find location field
		//first clear any pre written text
		driver.findElement(By.id("text-input-where")).clear();
		driver.findElement(By.id("text-input-where")).sendKeys("London");
		Thread.sleep(2000);
		//click on find jobs button...if no id right click and find xpath
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/form/div[3]/button")).click();
		//from job search results page, get page title and job count
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		
		//close driver
		driver.close();
		
	}
}
