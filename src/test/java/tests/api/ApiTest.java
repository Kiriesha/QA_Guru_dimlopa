package tests.api;

import models.UserData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static spec.Specs.request;

@Tag("API")
public class ApiTest extends TestBase {

    @Test
    @DisplayName("Check incorrent user creation")
    void createUserTest() {
        UserData user = new UserData();
        user.setName("Oleg");
        user.setJob("developer");

        UserData response = given()
                .spec(request)
                .log().uri()
                .log().body()
                .body(user.toString())
                .when()
                .post("/users")
                .then()
                .log().body()
                .extract().as(UserData.class);
        assertEquals(response.getName(),"Oleg");
        assertEquals(response.getJob(), "developer");
    }

    @Test
    @DisplayName("Check Valid Autorisation")
    void validAutorisationUserTest() {
        UserData user = new UserData();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("pistol");

        UserData response = given()
                .spec(request)
                .log().uri()
                .log().body()
                .body(user.toString())
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .log().status()
                .log().body()
                .extract().as(UserData.class);

        assertEquals(response.getToken(), "QpwL5tke4Pnpja7X4");
    }

    @Test
    @DisplayName("Check Invalid Autorisation")
    void invalidAutorisationUserTest() {
        UserData user = new UserData();
        user.setEmail("peter@klaven");

        UserData response = given()
                .spec(request)
                .log().uri()
                .log().body()
                .body(user.toString())
                .when()
                .post("/login")
                .then()
                .statusCode(400)
                .log().status()
                .log().body()
                .extract().as(UserData.class);

        assertEquals(response.getError(), "Missing password");
    }

    @Test
    @DisplayName("Check user deletion")
    void deleteUserTest() {
        given()
                .spec(request)
                .when()
                .delete("/users/2")
                .then()
                .statusCode(204);
    }
}
