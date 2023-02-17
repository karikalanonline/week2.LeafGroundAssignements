package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroungAssignmentButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Click and Confirm title, need to check that the console message is not printed
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title == "Dashboard") {
			System.out.println("Title is confirmed");
		}
		driver.navigate().back();
		
		//Confirm if the button is disabled, works fine
		boolean enabled = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		if(enabled == false) {
			System.out.println("This button is disabled");
		}
		
		//Find the position of the Submit button, works fine
		Point location = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
		System.out.println(location);
		
		

	}

}
