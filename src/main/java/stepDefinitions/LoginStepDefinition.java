//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/");
//	}
//
//	@When("^title of login page is free crm$")
//	public void title_of_login_page_is_free_crm() {
//		String title = driver.getTitle();
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_homepage() {
//		String title = driver.getTitle();
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts']"));
//		act.moveToElement(contact).build().perform();
//		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
//	}
//
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_firstname_and_lastname_position(String firstname, String lastname, String position) {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
