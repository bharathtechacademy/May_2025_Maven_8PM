package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebActions {
	
	//Buttons, Textbox, Dropdown, Checkbox, Radio-button, Hyperlink, Text, Scrollbar, Calendar, Icon, WebTables,Alerts, Frames, Images

	public static void main(String[] args) throws IOException {
		
//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://www.google.co.in/");
		
//		5. Locate the element
		WebElement element = driver.findElement(By.xpath("//element"));
		
		/********** Common WebElement Actions **********/
		
		// Check if the element is displayed on the page
		boolean isElementDisplayed = element.isDisplayed();
		
		// Check if the element is enabled on the page
		boolean isElementEnabled = element.isEnabled();

		// Check if the element is selected already on the page
		boolean isElementSelected= element.isSelected();
		
		/************* Regular Element Specific Actions *************/
		
		/********** Button Element **********/
		WebElement button = driver.findElement(By.xpath("//button"));
		
		// Get the label of the button
		String label1 = button.getText(); //if Button label is added as a text value.
		String label2 = button.getAttribute("value"); // If button label is added as an attribute value,
		
		// Click on the button
		button.click();
		
		// double click
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
		// right click
		actions.contextClick(button).perform();
		
		// move the mouse pointer towards button
		actions.moveToElement(button).perform();
		
		// drag and drop 
		actions.dragAndDrop(button,element).perform();
		
		// Scroll and Click on the hidden element when element is at the bottom of the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", button);
		
		button.click();
		
		// Click on the hidden element
		js.executeScript("arguments[0].click();", button);
		
		// Type in disabled text box
		js.executeScript("arguments[0].value='Bharath Reddy'", element);
		
		/********** Textbox Element **********/
		
		WebElement textbox = driver.findElement(By.xpath("//input"));
		
		 // Clear the textbox
		textbox.clear();
		
		// Enter text into textbox
		textbox.sendKeys("Text Value");
		
		/********** Dropdown Element **********/
		
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropdown);
		boolean isMultiSelectionAllowed = select.isMultiple();
		
		//single selection
		
		//Select the specific option
		select.selectByVisibleText("Local");
		select.selectByValue("local");
		select.selectByIndex(2);
		
		//Verify Selected Option
		String selectedOption = select.getFirstSelectedOption().getText();
		
		//Verify all options & it's count
		List<WebElement> options = select.getOptions();
		int totalOptions = options.size();
		
		//Print all options 
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		//multi selection
		
		//Select the multiple options
		select.selectByVisibleText("Local");
		select.selectByValue("local");
		select.selectByIndex(2);
		
		//De-select the multiple options
		select.deselectByVisibleText("Local");
		select.deselectByValue("local");
		select.deselectByIndex(2);
		
		select.deselectAll();
		
		 /********** Checkbox Element **********/
		
		WebElement checkbox = driver.findElement(By.xpath("//input"));
		
		// Click the checkbox only if it is not already selected
		if(!isElementSelected)
			checkbox.click();
		
		 /********** Radio Button Element **********/
		
		 // Click the radio button
		WebElement radioButton = driver.findElement(By.xpath("//input"));
		radioButton.click();
		
		/********** Image Element **********/
		WebElement image = driver.findElement(By.xpath("//img"));
		
		// Verify if the image element is displayed
		boolean isImageDisplayed =image.isDisplayed();
		
		// Get the source of the image /image is valid
		String sourceOfTheImage = image.getAttribute("src");
		
		// Verify the image dimensions
		int imageWidth = image.getSize().getWidth();
		int imageHeight = image.getSize().getHeight();
		
		// Get the position of the image
		int imageXAxis = image.getLocation().getX();
		int imageYAxis = image.getLocation().getY();
		
		// Load the image and verify a specific pixel color 
		int pixelColor =	ImageIO.read(new File(sourceOfTheImage)).getRGB(imageXAxis, imageYAxis);
		
		/********** Hyperlink Element **********/
		
		WebElement link = driver.findElement(By.xpath("//a"));

		
		 // Verify the URL in the hyperlink
		String hyperlink = link.getAttribute("href");
		
		//method -2 (click and verify)
		link.click();
		String hyperlink2 = driver.getCurrentUrl();
		
		 /********** Text Element **********/
		String text1 = button.getText(); //if Button label is added as a text value.
		String text2 = button.getAttribute("value"); // If button label is added as an attribute value,
	}

}
