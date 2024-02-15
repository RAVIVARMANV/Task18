package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame); 
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		Actions mouse = new Actions(driver);
		
		mouse.dragAndDrop(source, dest).perform();
		String targetElementColor = dest.getCssValue("background-color");
        if (targetElementColor.equals("rgba(0, 128, 0, 1)")) { // Assuming green color
            System.out.println("Drag and drop operation successful. Target element color changed.");
        } else {
            System.out.println("Drag and drop operation failed. Target element color not changed.");
        }

        String targetElementText = dest.getText();
        if (targetElementText.equals("Dropped!")) {
            System.out.println("Text of the target element changed to 'Dropped!' after drop.");
        } else {
            System.out.println("Text of the target element did not change to 'Dropped!' after drop.");
        }
	}

}
