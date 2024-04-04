package ApiEndPoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.ITestContext;

import static io.restassured.RestAssured.*;

public class Get_user {

    public static Response get_user(String URL, String username){
//        String username = (String) context.getSuite().getAttribute("username");
        Response response=given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("content-type","application/json")
                .pathParam("username",username)
        .when()
                .get(URL+"{username}");
        return response;
    }
}

