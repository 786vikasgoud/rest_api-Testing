package StepDefination;

import ApiEndPoints.Create_user;
import Utlities.PostRequestData;
import Utlities.setData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Map;

public class PostRequest {
    Response res;
    static String user;
    PostRequestData userData = new PostRequestData();
    @Given("A user with following Details")
    public void a_user_with_following_details(DataTable dataTable) {
        setData.dsf(dataTable,userData);
        user =userData.getUsername();
        System.out.println(user);
    }
    @When("I make a post request to create user {string}")
    public void i_make_a_post_request_to_create_user(String URL) {
        res= Create_user.postReuest(userData,URL);
        System.out.println(res.getBody().asString());
    }
    @Then("The responce body status contains {int}")
    public void the_responce_body_status_contains(int int1) {
        Assert.assertEquals(res.getStatusCode(),int1);
    }
    @Then("The responce body contains all following detais")
    public void the_responce_body_contains_all_following_detais() {
        org.json.JSONObject js = new org.json.JSONObject(res.getBody().asString());
        for(String element:js.keySet()){
            System.out.println(js.get(element));
        }
    }
}



//        List<Map<String, String>> userDetails = dsfs(dataTable);
//        List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);
//
//        if (userDetails.size() > 0) {
//            Map<String, String> userDetail = userDetails.get(0); // Assuming there's only one set of details
//            userDetail.forEach((field, value) -> {
//                switch (field) {
//                    case "id":
//                        userData.setId(Integer.parseInt(value));
//                        break;
//                    case "username":
//                        userData.setUsername(value);
//                        break;
//                    case "firstName":
//                        userData.setFirstName(value);
//                        break;
//                    case "lastName":
//                        userData.setLastName(value);
//                        break;
//                    case "email":
//                        userData.setEmail(value);
//                        break;
//                    case "password":
//                        userData.setPassword(value);
//                        break;
//                    case "phone":
//                        userData.setPhone(value);
//                        break;
//                    case "userStatus":
//                        userData.setUserStatus(Integer.parseInt(value));
//                        break;
//                }
//            });
//        } else {
//            throw new IllegalArgumentException("No user details found in DataTable.");
//        }
