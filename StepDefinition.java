package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass{

	public ChromeDriver driver;
	
	/*@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Load the application url {string}")
	public void loadUrl(String url) {
		driver.get(url);
	}
	*/
	
	@Given("Enter username as {string}")
	public void userName(String uname)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@And("Enter password as {string}")
	public void password(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Title should match view login {string}")
	public void homepage(String expTitle) {
		String actTitle=driver.getTitle();
		if(actTitle.equals(expTitle))
		{
			System.out.println("Homepage verified");
		}
		else
		{
			System.out.println("Homepage is not correct");
		}
	}
	
	@But("Error page should be displayed")
	public void errorPage()
	{
		WebElement y=driver.findElement(By.xpath("//p[contains(text(),'User not found.')]"));
		if(y.isDisplayed())
		{
			System.out.println("Error page is displayed");
		}
		else
		{
			System.out.println("Error page is not displayed");
		}
		
	}
	
	@When("Click on crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	
}
