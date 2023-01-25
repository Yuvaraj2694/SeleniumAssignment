import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dupliactelead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("poorvikamobiles");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvaraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raja");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Descrption");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yuvaraj@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated Important note");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		System.out.println("the title is:" + driver.getTitle());
		if(driver.getTitle().contains("View Lead | opentaps CRM"));
		System.out.println("the title is confired");
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("poorvikamobiles");
	}
}
