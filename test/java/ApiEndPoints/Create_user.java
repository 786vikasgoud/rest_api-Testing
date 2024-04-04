package ApiEndPoints;

import Utlities.PostRequestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Create_user {
    public static Response postReuest(PostRequestData userdata, String URL) {


        Response res = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("content-type", "application/json")
                .body(userdata)
        .when()
                .post(URL);

        return res;
    }
}
