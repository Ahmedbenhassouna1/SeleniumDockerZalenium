package testCases;

//import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ExcuteTestZaleniumFireFox1 {

	@Test
	public void test1() throws MalformedURLException, InterruptedException {

		System.out.println("Thread which is running" +Thread.currentThread().getId());

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		//cap.setPlatform(Platform.WIN10);
		WebDriver driver = new RemoteWebDriver(new URL ("http://localhost:4444/wd/hub"), cap);
		driver.get("https://www.sephora.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}


}
