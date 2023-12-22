package Home_work_22;

import Home_work_22.Generator.DataGenerator;
import Home_work_22.Models.PostPutPatchMethodsModel;
import Home_work_22.Models.RegisterLoginActionsModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredRequestTest {
    private final String BASE_URL = "https://reqres.in";

    @BeforeTest
    public void loggingSetUp() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void ListUsersTest() {
        given()
                .baseUri(BASE_URL)
                .queryParam("page", "2")
                .when()
                .get("/api/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void SingleUserTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void ListResourceTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200);
    }

    @Test
    public void SingleResourceTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void PostCreateTest() {
        PostPutPatchMethodsModel createModel = PostPutPatchMethodsModel
                .builder()
                .name(DataGenerator.generateName())
                .job(DataGenerator.generateJob())
                .build();

        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(createModel)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);
    }

    @Test
    public void PutUpdateTest() {
        PostPutPatchMethodsModel putUpdateModel = PostPutPatchMethodsModel
                .builder()
                .name(DataGenerator.generateName())
                .job(DataGenerator.generateJob())
                .build();

        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(putUpdateModel)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void PatchUpdateTest() {
        PostPutPatchMethodsModel patchUpdateModel = PostPutPatchMethodsModel
                .builder()
                .name(DataGenerator.generateName())
                .job(DataGenerator.generateJob())
                .build();

        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(patchUpdateModel)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void DeleteTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }

    @Test
    public void RegisterTest() {
        RegisterLoginActionsModel registerEmail = new RegisterLoginActionsModel();
        RegisterLoginActionsModel registerModel = RegisterLoginActionsModel
                .builder()
                .email(registerEmail.getEmail())
                .password(DataGenerator.generatePassword())
                .build();

        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(registerModel)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200);
    }

    @Test
    public void LoginTest() {
        RegisterLoginActionsModel registerEmail = new RegisterLoginActionsModel();
        RegisterLoginActionsModel registerModel = RegisterLoginActionsModel
                .builder()
                .email(registerEmail.getEmail())
                .password(DataGenerator.generatePassword())
                .build();

        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(registerModel)
                .when()
                .post("/api/login")
                .then()
                .statusCode(200);
    }
}
