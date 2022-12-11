package mobile_testing_app;


import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class MobileTesting {
	private static WebDriver localDriver;
	private static PrintStream outputStream;

	public static void printTest(int testNumber) {
		String page = localDriver.getPageSource();
		System.out.println("("+testNumber+")");
		System.out.println(page);
		System.out.println();

		outputStream.println("("+testNumber+")");
		outputStream.println(page);
		outputStream.println();
		//OutputFile.txt format: (1)com.experitest.ExperiBank:id/usernameTextField
	}


	public static void init(WebDriver driver, File output) throws FileNotFoundException {
		localDriver = driver;
		outputStream = new PrintStream(output);
	}


	public static WebDriver getDriver() {
		return localDriver;
	}

}
