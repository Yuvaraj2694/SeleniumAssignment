package Week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("poorvikamobiles");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvaraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropdown);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.className("smallSubmit")).click();
	}
}
