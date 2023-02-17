package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAssignmentsTextBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		//Type your name, works fine
		driver.findElement(By.name("j_idt88:name")).sendKeys("Test1");
		
		//Append Country to this City, need to check how to append
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("India");  //need to check
		
		//Verify if text box is disabled, works fine
		boolean enabled = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		
		if(enabled ==false) {
			System.out.println("This text box is is disabled");		
		}
		
		//Clear the typed text, works fine
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		
		//Retrieve the typed text, works fine
		String text = driver.findElement(By.name("j_idt88:j_idt97")).getText();
		System.out.println(text);
		
		//Type email and Tab. Confirm control moved to next element, need to check
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("Karikalan.online@gmail.com");  
		
		//Type about yourself, works fine
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("I am cool");
		
		//Text Editor, works fine
		driver.findElement(By.xpath("(//div[@class='ql-container ql-snow']/div)[1]")).sendKeys("This is Text editor");
		
		//Just Press Enter and confirm error message*, works fine
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		boolean displayed = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).isDisplayed();
		if (displayed == true) {
			System.out.println("The error message is displayed");
		}
		
		//Click and Confirm Label Position Changes, need to check, message not printed
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		String text2 = driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).getText();
		System.out.println(text2);
		if(text2 == "") {
			System.out.println("The label position gets changed");
		}
		
		//Type your name and choose the third option (not sure how to do)
	    //driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Ka");  
	    //driver.findElement(By.xpath("(//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li)[3]")).click();
	    
	    //Click and Confirm Keyboard appears, works fine
	    driver.findElement(By.name("j_idt106:j_idt122")).click();
	    boolean keyBoard = driver.findElement(By.className("ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay")).isDisplayed();
	    if (keyBoard == true) {
	    	System.out.println("Keyboard is displaying");
	    }
		
	    
		

	}

}
