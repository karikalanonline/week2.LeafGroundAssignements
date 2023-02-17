package week2.day2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAssignmentCheckbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//Basic Checkbox, works fine
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Notification, works fine
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		//Choose your favorite language(s), need to check attributes dynamically changed
		//driver.findElement(By.)
		
		//Tri State Checkbox, not working need to check
		//driver.findElement(By.className("ui-chkbox-icon ui-c")).click();
		
		//Toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		//Verify if check box is disabled,not working need to check
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(enabled == false) {
			System.out.println("The checbox is disabled");
		}
		
		//Select Multiple, need to check attributes changes dynamically.
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		driver.findElement(By.xpath("/ul/li[1]/label")).click();
		
		
		
		
	

	}

}
