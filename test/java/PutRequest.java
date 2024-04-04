import Utlities.PostRequestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PutRequest {
    @Test
    public void PerformPutRequest(){
        PostRequestData data1=new PostRequestData();
        data1.setId(15);
        data1.setUsername("Vikas");
        data1.setFirstName("shivaiahgari");
        data1.setLastName("Vikasgoud");
        data1.setEmail("shivaiahgarivikasgoud@gmail.com");
        data1.setPassword("112345");
        data1.setPhone("9951962196");
        data1.setUserStatus(0);
        Response res = given()
                .header("content-type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(data1)
                .pathParam("username","Vikas goud")
        .when()
                .put("https://petstore.swagger.io/v2/user/{username}");
        System.out.println(res.getBody().asString());

    }
}
