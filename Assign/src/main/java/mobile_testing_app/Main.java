package mobile_testing_app;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Main {
    // resource-id attributes of all of the pages' XML elements
    static String[] loginPageElements = {"com.experitest.ExperiBank:id/usernameTextField", "com.experitest.ExperiBank:id/passwordTextField", "com.experitest.ExperiBank:id/loginButton"};

    public static void main(String[] args) throws MalformedURLException, IOException, Exception {
        // Collect path to Android application
        Path currentRelativePath = Paths.get("");
        String eribankApp = Paths.get(currentRelativePath.toAbsolutePath().toString(), "app/EriBank.apk").toString();

        // Output of tests
        String outputPath = Paths.get(currentRelativePath.toAbsolutePath().toString(), "results/OutputFile.txt").toString();
        File output = new File(outputPath);
        output.delete();
        output.createNewFile();

        // Set capabilities for Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        // Automatic timeout of application if no commands are given through Appium
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000"); // Seconds
        capabilities.setCapability(MobileCapabilityType.APP, eribankApp);

        // Location of Appium server running on localhost
        // The port should be given as a parameter to this function to allow diversity
        String appiumPath = "http://127.0.0.1:4723/wd/hub";

        // App is launched on creation of the driver
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(appiumPath), capabilities);

        // Timeout function
        long timeout = 6; // 6 seconds
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        // Page load check
        boolean loaded;
        loaded = waitForLoad(wait, "loginPage");

        if (!loaded) {
            throw(new Exception("Initial page did not load."));
        }

        // Start submission's actions on the app
        MobileTesting.init(driver, output);

        // (Try catch not necessary for student version)
        try {
            Assignment.run();
        } catch (Exception e) {
            MobileTesting.printTest(-1); //Error in execution
            System.err.println(e);
        }
    }


    // Wait for the item to be loaded
    public static boolean waitForLoad(WebDriverWait wait, String name) {
        // Check if all necessary elements exist
        try {
            if (name == "loginPage") {
                for (int i=0; i<loginPageElements.length; i++) {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@resource-id=\'"+loginPageElements[i]+"\']")));
                }
            }
            else {
                throw(new IllegalArgumentException("Argument pageName: expected \"loginPage\""));
            }
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }
}