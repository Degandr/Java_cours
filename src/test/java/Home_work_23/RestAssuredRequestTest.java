package Home_work_23;

import Home_work_23.Generator.DataGenerator;
import Home_work_23.Models.PostPutPatchMethodsModel;
import Home_work_23.Models.RegisterLoginActionsModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.path.json.JsonPath.from;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

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
                .statusCode(200)
                .body("page", equalTo(2)).and()
                .body("data", notNullValue());
    }

    @Test
    public void SingleUserTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/singleUserSchema.json")));
    }

    @Test
    public void ListResourceTest() {
        JsonPath listResourceAnswer = new JsonPath(new File("src/test/resources/listResourcesAnswer.json"));
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200)
                .body("", equalTo(listResourceAnswer.getMap("")));
    }

    @Test
    public void SingleResourceTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/singleResourceSchema.json")));
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
                .statusCode(201).and()
                .body("name", equalTo(createModel.getName())).and()
                .body("job", equalTo(createModel.getJob())).and()
                .body(matchesJsonSchema(new File("src/test/resources/postSchema.json")));

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
                .statusCode(200).and()
                .body("name", equalTo(putUpdateModel.getName())).and()
                .body("job", equalTo(putUpdateModel.getJob())).and()
                .body(matchesJsonSchema(new File("src/test/resources/putPatchSchema.json")));
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
                .statusCode(200).and()
                .body("name", equalTo(patchUpdateModel.getName())).and()
                .body("job", equalTo(patchUpdateModel.getJob())).and()
                .body(matchesJsonSchema(new File("src/test/resources/putPatchSchema.json")));
    }

    @Test
    public void DeleteTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204).and()
                .body(equalTo(""));
    }

    @Test
    public void RegisterTest() {
        RegisterLoginActionsModel registerEmail = new RegisterLoginActionsModel();
        RegisterLoginActionsModel registerModel = RegisterLoginActionsModel
                .builder()
                .email(registerEmail.getEmail())
                .password(DataGenerator.generatePassword())
                .build();

        String response = given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(registerModel)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        String token = from(response).get("token");
        int id = from(response).get("id");
    }

    @Test
    public void LoginTest() {
        RegisterLoginActionsModel registerEmail = new RegisterLoginActionsModel();
        RegisterLoginActionsModel registerModel = RegisterLoginActionsModel
                .builder()
                .email(registerEmail.getEmail())
                .password(DataGenerator.generatePassword())
                .build();

        String response = given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(registerModel)
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        String token = from(response).get("token");
    }
}
