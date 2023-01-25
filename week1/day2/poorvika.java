package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class poorvika {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://poorvika.com/");
		driver.manage().window().maximize();
	}
}
