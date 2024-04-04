import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class DeleteRequest {
    @Test
    public void performPutRequest(){
       Response res=given()
               .contentType(ContentType.JSON)
               .accept(ContentType.JSON)
               .header("content-type","application/json")
               .pathParam("username","Vikas")
        .when()
               .delete("https://petstore.swagger.io/v2/user/{username}");
        System.out.println(res.getBody().asString());
    }
}
