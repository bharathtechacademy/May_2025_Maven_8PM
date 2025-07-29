package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions8 {

    public static void main(String[] args) throws InterruptedException, IOException {

        // 1. Launch chrome browser window
        WebDriver driver = new ChromeDriver();

        // 2. Maximize the browser window
        driver.manage().window().maximize();

        // 3. Delete all the cookies
        driver.manage().deleteAllCookies();

        // 4. Enter URL and Launch the application
        driver.get("https://www.orangehrm.com/en/contact-sales");

        // Initialize WebDriverWait and Actions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Actions actions = new Actions(driver);

        try {
            // Handle the cookie consent banner first, as it can interfere with clicks.
            try {
                WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")));
                acceptCookiesButton.click();
                System.out.println("Accepted all cookies.");
            } catch (Exception e) {
                System.out.println("Cookie banner not found or already handled. Continuing...");
            }

            // Wait for the "Solutions" menu link to be visible and clickable.
            // Using a more specific XPath to ensure we get the main navigation link.
            WebElement solutionsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@class, 'web-menu')]//a[contains(text(), 'Solutions')]")));
            System.out.println("Solutions menu link is clickable.");

            // 5. Mouse hover on "Solutions"
            actions.moveToElement(solutionsMenu).perform();
            System.out.println("Hovered over Solutions menu.");

            // 6. Wait for 'People Management' to be visible and then hover over it.
            // CORRECTED: Target the <li> element containing the text "People Management", as it is not an <a> tag itself.
            WebElement peopleManagement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class, 'sub-menu-title') and contains(., 'People Management')]")));
            System.out.println("People Management menu item is visible.");
            actions.moveToElement(peopleManagement).perform();
            System.out.println("Hovered over People Management.");

            // 7. Wait for "HR Administration" link to be clickable and then hover.
            // CORRECTED: The container class is 'platform-menu-title', not 'platform-menu-content'.
            WebElement hrAdmin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'platform-menu-title')]//a[normalize-space()='HR Administration']")));
            System.out.println("HR Administration link found and is clickable.");
            actions.moveToElement(hrAdmin).perform();
            System.out.println("Hovered over HR Administration.");

            // Add a brief, final pause to see the final state before the screenshot.
            Thread.sleep(2000);

            // 8. Take screenshot
            takeScreenshot(driver, "PeopleManagement_HRAdministration_Success");
            Thread.sleep(1000); // Wait for the screenshot to save.

        } catch (Exception e) {
            System.err.println("An error occurred during the test execution: " + e.getMessage());
            e.printStackTrace();
            // Taking a screenshot on failure is a good practice for debugging.
            takeScreenshot(driver, "Error_Screenshot");
        } finally {
            // 9. Close the browser
            System.out.println("Closing the browser.");
            driver.quit();
        }
    }

    /**
     * Takes a screenshot of the entire web page.
     *
     * @param driver The WebDriver instance.
     * @param screenshotName The name for the screenshot file (without extension).
     * @return The absolute path of the saved screenshot.
     * @throws IOException If an I/O error occurs during file operations.
     */
    public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
        // Define the directory for screenshots
        String screenshotDir = System.getProperty("user.dir") + File.separator + "Screenshots";
        File dir = new File(screenshotDir);
        if (!dir.exists()) {
            dir.mkdirs(); // Create the directory if it doesn't exist
        }

        // Construct the full path for the screenshot file
        String screenshotPath = screenshotDir + File.separator + screenshotName + ".png";
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Copy the screenshot file to the specified path
        FileUtils.copyFile(screenshotFile, new File(screenshotPath));
        System.out.println("Screenshot saved to: " + screenshotPath);
        return screenshotPath;
    }
}
