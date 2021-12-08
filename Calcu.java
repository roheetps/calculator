package caal;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Calcu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"/src/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\COMnet\\Desktop\\ra\\Surp\\src\\resources\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
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
		
		
		


		
		
		
		
		
		
	driver.quit();	
	}
	
}
