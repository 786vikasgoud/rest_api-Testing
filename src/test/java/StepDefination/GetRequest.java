package StepDefination;

import ApiEndPoints.Get_user;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.Assert;
import org.testng.ITestContext;

public class GetRequest {
    String username;
    Response response;

    @Given("Set the pathparam")
    public void set_the_pathparam() {
        username = PostRequest.user;
        System.out.println(username);
    }

    @When("Make a get request for to get user {string}")
    public void make_a_get_request_for_to_get_user(String URL) {
        response = Get_user.get_user(URL,username);
    }

    @Then("The responce body contains the status code {int}")
    public void the_responce_body_contains_the_status_code(int int1) {
        Assert.assertEquals(response.getStatusCode(),int1);
    }

    @Then("reaponse body contains all the following details")
    public void reaponse_body_contains_all_the_following_details() {
        System.out.println(response.getBody().asString());
    }

}
