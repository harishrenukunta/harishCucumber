package com.harish.framework;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseRestService{

    public RequestSpecification getRequestSpec(){
        return given().log().all();
    }

    public Response get(final String uri, final Map<String, String> pathParams, final Map<String, String> headers){
        final RequestSpecification requestSpec = getRequestSpec();
        if(pathParams != null){
            requestSpec.pathParams(pathParams);
        }
        if(headers != null){
            requestSpec.headers(headers);
        }
        return requestSpec.when().get(uri);
    }

    public Response get(final String url){
        return get(url, null, null);
    }

    public Response post(final String url, final String json){
        return given()
                .contentType(ContentType.JSON)
                .body(json)
                .when()
                .post(url);
    }

}
