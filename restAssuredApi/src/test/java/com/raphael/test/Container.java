package com.raphael.test;

import com.raphael.framework.RestAssuredCongfiguration;
import com.raphael.test.common.EndPoint;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import javax.xml.ws.Endpoint;

import static io.restassured.RestAssured.given;


public class Container {

    @Test
    public void validateContainer()
    {
        given().get("http://wcdevisapp10:8098/domainServices/containers?id=31287").then().statusCode(200).log().all();
    }

    // Regular GET all api... /domainServices/containers
    @Test(groups = "demo")
    public void validateContainer2()
    {
        given().get(EndPoint.GET_CONTAINER).then().statusCode(200).log().all();
    }

//    // Query param api... /domainServices/containers?id=226489
//    @Test(groups = "demo")
//    public void validateQueryParam()
//    {
//        RequestSpecification requestSpecification = new RestAssuredCongfiguration().getRequestSpecification();
//        requestSpecification.queryParam("Location_id",118 ).log().all();
//        given().spec(requestSpecification).get(EndPoint.GET_QUERY_PARAM)
//                .then().statusCode(200).log().all();
//
//
//        // getting response
//
//
//
//
//    }


    // Path param api... /domainServices/containers/2334445/parent

}
