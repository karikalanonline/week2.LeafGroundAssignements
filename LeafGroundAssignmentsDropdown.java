package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundAssignmentsDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Which is your favorite UI Automation tool, works fine
		WebElement automationTool = driver.findElement(By.xpath("(//div[@class='col-12'])[1]/select"));
		Select favTool = new Select(automationTool);
		favTool.selectByVisibleText("Selenium");
		
		//Choose your preferred country. need to check li tag dynamically changed
		//driver.findElement(By.)
		//for the remaining tasks, class dynamically changed when hover over the mouse.
		
				
		
			

	}

}
