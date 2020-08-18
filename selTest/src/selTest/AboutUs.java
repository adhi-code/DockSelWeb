package selTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutUs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Indus_Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://34.121.59.177:7030/");
		driver.findElement(By.id("About Us")).click();
		WebElement element = driver.findElement(By.id("PID-ab2-pg"));
		String s1 = element.getText();
		String s2 = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
		if(s2.equals(s1)) {
			System.out.println("Equal and Success");
		}
	}

}
