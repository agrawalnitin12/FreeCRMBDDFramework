//package stepDefinitions;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefinition {
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
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		List<List<String>> data = credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
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
//	@Then("^user moves to Deal Page$")
//	public void user_moves_to_Deal_Page() {
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		WebElement contact = driver.findElement(By.xpath("//a[@title='Deals']"));
//		act.moveToElement(contact).build().perform();
//		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable credentials) {
//		List<List<String>> data = credentials.raw();
//		driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
