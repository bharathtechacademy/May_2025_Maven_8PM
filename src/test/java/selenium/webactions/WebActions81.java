package selenium.webactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions81 {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
//		1. Launch chrome browser window
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://www.orangehrm.com/en/contact-sales)
		driver.get("https://www.orangehrm.com/en/contact-sales");		

//		wait for header
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[text()='Solutions']"), 0));
		
//		5. Locate solutions menu link and mouse hover on it and focus on it
		WebElement solutionsMenu = driver.findElement(By.xpath("//a[text()='Solutions']"));
		Actions actions = new Actions(driver);
        Thread.sleep(5000);
		actions.moveToElement(solutionsMenu).perform();		
        Thread.sleep(5000);

//		6.Hover on "People Management"
        WebElement peopleManagement = driver.findElement(By.xpath("//li[contains(text(),'People Management')]"));
        actions.moveToElement(peopleManagement).perform();
        Thread.sleep(3000);

//		7.Hover on "HR Administration"
        WebElement hrAdmin = driver.findElement(By.xpath("//a[contains(@href,'hr-administration')]"));
        actions.moveToElement(hrAdmin).perform();
        Thread.sleep(3000);

//		8.Take screenshot
        takeScreenshot(driver, "PeopleManagement_HRAdministration");
        Thread.sleep(10000);

//		9. Close the browser
		driver.quit();
		
			
		
	}
	
	public static void jsMouseOver(WebDriver driver, WebElement element) {
        String script =
          "var ev = document.createEvent('MouseEvents');" +
          "ev.initMouseEvent('mouseover', true, true, window, 0, 0,0,0,0, false,false,false,false,0,null);" +
          "arguments[0].dispatchEvent(ev);";
        ((JavascriptExecutor) driver).executeScript(script, element);
    }
	
	public static void hoverWithRobot(WebDriver driver, WebElement element) throws AWTException {
        Point loc = element.getLocation();
        Dimension size = element.getSize();
        int centerX = loc.getX() + size.getWidth() / 2;
        int centerY = loc.getY() + size.getHeight() / 2;

        Robot robot = new Robot();
        robot.mouseMove(centerX, centerY);
        robot.delay(500);
    }
	
	public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName+".png";
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		return screenshotPath;
	}
	
	public static String takeScreenshot(WebElement element, String screenshotName) throws IOException {
		String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName+".png";
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		return screenshotPath;
	}

}
