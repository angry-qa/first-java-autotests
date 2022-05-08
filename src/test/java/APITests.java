import org.junit.jupiter.api.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.assertj.core.api.Assertions.assertThat;

public class APITests {

  @BeforeAll
  static void setup() { RestAssured.baseURI = "https://postman-echo.com"; }

  @Test
  void shouldStatusCodeIs200() {
    given()
        .contentType(JSON)
        .when()
        .post("/post")
        .then()
        .statusCode(200);
  }

  @Test
  void shouldCorrectParam() {
    String response =
        given()
            .contentType(JSON)
            .when()
            .post("/post?param=test")
            .then()
            .extract().asString();

    assertThat(response).contains("\"param\":\"test\"");
  }

}
