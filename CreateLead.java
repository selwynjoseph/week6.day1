package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@Then("Title should match view home {string}")
	public void myHomeDisplayed(String expTitle)
	{
		String actTitle=driver.getTitle();
		if(actTitle.equals(expTitle))
		{
			System.out.println("My Home is displayed");
		}
		else
		{
			System.out.println("My Home is not displayed");
		}
		
	}
	
	@When("Click on leads link")
	public void clickLeadsLink()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click on CreateLead link")
	public void clickCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And("Enter company name as {string}")
	public void enterCompanyName(String company)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	
	@And("Enter first name as {string}")
	public void enterFirstName(String firstName) 
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	
	@And("Enter last name as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}
	
	@And("Click on CreateLead button")
	public void clickCreateLeadSubmitButton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	@Then("Title should match view lead {string}")
	public void viewLeadDisplayed(String expTitle)
	{
		String actTitle=driver.getTitle();
		if(actTitle.equals(expTitle))
		{
			System.out.println("View lead page is displayed");
		}
		else
		{
			System.out.println("View lead page is not displayed");
		}
	}
	
	
	
	
	
	
}
