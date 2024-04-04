import Utlities.PostRequestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.*;
public class PostRequest {
    @Test
    public void test_1(){
        PostRequestData data =new PostRequestData();
        data.setId(15);
        data.setUsername("Vikas goud");
        data.setFirstName("shivaiahgari");
        data.setLastName("Vikasgoud");
        data.setEmail("shivaiahgarivikasgoud@gmail.com");
        data.setPassword("112345");
        data.setPhone("9951962196");
        data.setUserStatus(0);

        Response responce = given()
                .header("content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(data)
                .baseUri("https://petstore.swagger.io/")
                .basePath("v2/user")
        .when()
                .post();
//                .post("https://petstore.swagger.io/v2/user");
        System.out.println(responce.getBody().asString());
        Assert.assertEquals(responce.getStatusCode(),200);
        String responseBody = responce.getBody().asString();
        System.out.println("Response Body: " + responce.getBody().asString());
        org.json.JSONObject jsonObject = new org.json.JSONObject(responseBody);
        System.out.println(jsonObject);



    }

}
