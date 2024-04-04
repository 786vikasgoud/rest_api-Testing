import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class getusercreated {

    @Test
    public void getUserCreatedByPost(){
       Response res = given()
               .header("content-type","application/json")
               .contentType(ContentType.JSON)
               .accept(ContentType.JSON)
               .pathParam("username","Vikas goud")
               .baseUri("https://petstore.swagger.io")
               .basePath("/v2/user/")
        .when()
               .get("{username}");
//               .get("https://petstore.swagger.io/v2/user/{username}");
        System.out.println(res.statusCode());
        System.out.println(res.getBody().asString());
        org.json.JSONObject jos = new org.json.JSONObject(res.getBody().asString());
        for(String k:jos.keySet()){
            System.out.println(jos.get(k));
        }
    }
}
