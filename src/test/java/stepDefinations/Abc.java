package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Abc {
	@Given("serach the data")
	public void serach_the_data() {
		
		System.out.println("############");
	}

	@When("user enters the data")
	public void user_enters_the_data() {
		System.out.println("hello world ############3");
	}

	@Then("user is able to see the data")
	public void user_is_able_to_see_the_data() {
		System.out.println("***********************");
	}
	
	


}
