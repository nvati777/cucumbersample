package testcucum;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepcls {
	WebDriver driver;
	
/*	@Given("sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
	
	driver=Drivers.getDriver("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By .linkText("SignIn")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Given("executive is at the signup registration")
public void executive_is_at_the_signup_registration() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("executive provides {string} and {string}")
public void executive_provides_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("signup successful")
public void signup_successful() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Given("sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


}*/

@Given("sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
	
driver=NewDrivers.getDriver("chrome");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By .linkText("SignIn")).click();
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}

@Given("Alex is an existing customer")
public void alex_is_an_existing_customer() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Given("Alex had good purchase record")
public void alex_had_good_purchase_record() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("Alex provided with mobile number")
public void alex_provided_with_mobile_number() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("Registration is success")
public void registration_is_success() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

/*@Given("sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}


@Given("sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}*/

@When("Sales Executive provides {string} and {string}")
public void sales_Executive_provides_and(String string, String string2) {
	driver.findElement(By .name("userName")).sendKeys(string);
	driver.findElement(By .name("password")).sendKeys(string2);
	driver.findElement(By .name("Cancel")).click();
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}

@Then("Login is successful")
public void login_is_successful() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@Given("Alex purchased microwave for {int} dollers")
public void alex_purchased_microwave_for_dollers(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}

@Given("Alex has a receipt")
public void alex_has_a_receipt() {
    // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.java.PendingException();
}

@When("Alex returns the faulty microwave")
public void alex_returns_the_faulty_microwave() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("Alex got refund of {int} dollers")
public void alex_got_refund_of_dollers(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Given("executive added the items to cart")
public void executive_added_the_items_to_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("items price is calculated")
public void items_price_is_calculated() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("bill is generated with final amount")
public void bill_is_generated_with_final_amount() {}
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();


/*@Given("sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("Sales Executive provides {string} and {string}")
public void sales_Executive_provides_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("Login is successful")
public void login_is_successful() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}*/



@Given("executive is at the signup registration")
public void executive_is_at_the_signup_registration() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("executive provides {string} and {string}")
public void executive_provides_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("signup successful")
public void signup_successful() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@When("Larry searches a product in search field")
public void larry_searches_a_product_in_search_field() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("lary verifies the product avilability")
public void lary_verifies_the_product_avilability(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   // throw new io.cucumber.java.PendingException();
	List<String>pro_list=dataTable.asList();
	System.out.println(pro_list.size());
	for(String plist:pro_list) {
		driver.findElement(By .name("products")).sendKeys(plist);
		String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
		System.out.println(str);
		driver.findElement(By .name("products")).clear();
		
	}
}
}


