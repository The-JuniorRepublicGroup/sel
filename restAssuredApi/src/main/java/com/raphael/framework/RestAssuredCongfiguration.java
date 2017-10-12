package com.raphael.framework;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;

import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;

public class RestAssuredCongfiguration {

    @BeforeSuite(alwaysRun = true)
    public void configure()
    {
        RestAssured.baseURI = "http://wcdevisapp10";
        RestAssured.port = 8098;
        RestAssured.basePath = "/domainServices";
    }



}
