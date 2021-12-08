package caal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CalcuTestng {
   
	
	RemoteWebDriver driver;
	

	@Test(priority=1)
	public void Open() throws InterruptedException  {
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"/src/resources/chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\COMnet\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	@Test(priority=2)
	public void Geturl()
	{
	
		driver.get("https://www.calculator.net/");
	System.out.println("url get opened");
	}
			
	@Test(priority=3)
	public void Multiplication() throws InterruptedException {
	
	
			//423*525
			System.out.println("1st TestCase");
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			System.out.println("get 3rd number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			System.out.println("Multiplication");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
			
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			System.out.println("get 3rd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
			
			
			//driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).show();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			
			Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void Division() throws InterruptedException {
	
	//4000/200
			System.out.println("2nd TestCase");
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			
			System.out.println("get 3rd number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			
			System.out.println("get 4th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			
			
			System.out.println("Division");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
			
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			
			System.out.println("get 3rd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			Thread.sleep(2000);		
	}
			
	@Test(priority=5)
	public void Addition() throws InterruptedException {
	
	//-234234+345345
			
			System.out.println("3rd TestCase");
			
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			System.out.println("get 3rd number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			
			
			System.out.println("get 4th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			
			
			System.out.println("get 5th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			System.out.println("get 6th number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			
			
			System.out.println("Addition");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
			
			
			
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			System.out.println("get 3rd number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
			
			
			
			System.out.println("get 4th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		
			
			System.out.println("get 5th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			System.out.println("get 6th number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
			
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			Thread.sleep(2000);
			
			
			
			
}
	
	@Test(priority=6)
	public void Subtraction() throws InterruptedException {
	
			
			
	System.out.println("4th TestCase");
			
			
			
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			System.out.println("get 3rd number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
	        System.out.println("get 4th number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
			
			System.out.println("get 5th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			
			
			System.out.println("get 6th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			
			
			
			
			System.out.println("Subtraction");
			
			
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			
			
			
			
			System.out.println("get 1st number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
			
			
			System.out.println("get 2nd number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			System.out.println("get 3rd number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			
			
			
			System.out.println("get 4th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
		
			
			System.out.println("get 5th number");
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			System.out.println("get 6th number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
			
	System.out.println("get 7th number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			
	System.out.println("get 8th number");
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			Thread.sleep(2000);
			
			driver.close();
				}


}
