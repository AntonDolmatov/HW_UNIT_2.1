import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test {
    @org.junit.jupiter.api.Test
    public void shouldTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));
    }

}