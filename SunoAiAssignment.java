package learnTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SunoAiAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// WebDriver instance for browser interaction
		WebDriver driver=new ChromeDriver();
		
		// Maximize browser window for better view
		driver.manage().window().maximize();
		
		// Target URL for Suno.ai website
		driver.get("https://www.suno.ai/");
		
		// Find the "Make a song" button and click it
		WebElement makeASong=driver.findElement(By.xpath("//a[@class='styles_callToAction__RN6Db styles_buttonPrimary__NiKEY']//span[text()='Make a song']"));
		Thread.sleep(1000);
		 makeASong.click();
		
		
		// Find the "Create" button and click it
		WebElement create=driver.findElement(By.xpath("//a[@class='chakra-link css-14ty6fq']//div[text()='Create']"));
		Thread.sleep(1000);
		create.click();
		
		
		// Find the song description text area and enter desired description
		WebElement songDescription=driver.findElement(By.xpath("div[@class='chakra-stack css-1jjjd9b']//following::textarea[@class='chakra-textarea css-pljwwf']"));
		Thread.sleep(1000);
		songDescription.sendKeys("Create an telugu flock reimagination of Cruel Summer's melody");
		
		// XPath to find the "Create Music" button and click it
		WebElement createMusic=driver.findElement(By.xpath("div[@class='chakra-stack css-8g8ihq']//following::button[@class='chakra-button css-k5zpo8']"));
		Thread.sleep(1000);
		createMusic.click();
		
		// Find the "Play Music" button and click it
		WebElement playMusic=driver.findElement(By.xpath("//button[@class='chakra-button css-1ynxiaw']//following::svg[@stroke='currentColor']"));
		Thread.sleep(1000);
		playMusic.click();
		
		
		// Minimize browser window (optional)
		driver.manage().window().minimize();
		
		
		// Close the browser window
		driver.quit();
		
		
	
	}

}
