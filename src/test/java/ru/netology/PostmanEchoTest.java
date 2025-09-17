package ru.netology;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void testPostRequestWithBody() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("Ivan") // отправляемые данные
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Ivan")); // проверка, что в поле data находятся отправленные данные
    }
//    @Test
//    public void testPostRequestWithDifferentBody() {
//        // Этот тест должен упасть, так как мы отправляем одни данные, а проверяем другие
//        given()
//                .baseUri("https://postman-echo.com")
//                .body("Ivan")
//                .when()
//                .post("/post")
//                .then()
//                .statusCode(200)
//                .body("data", equalTo("Vasya")); // Здесь намеренная ошибка для демонстрации fail
//    }
}
