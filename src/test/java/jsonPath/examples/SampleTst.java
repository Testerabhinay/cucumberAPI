package jsonPath.examples;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.hamcrest.Matchers.*;

import testBase.TestBase;

public class SampleTst
{
	static final String APIKEY = "gjvv4yyrvuctnag8yn74vy6c";
	
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "http://api.walmartlabs.com";
		RestAssured.basePath = "/v1";
	}
	
	@Test
	public void test001()
	{
		RestAssured.given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format", "json")
		
		.when()
		.get("/search")
		.then()
		.body("numItems",equalTo(10));
		//.extract().path("numItems");
		//System.out.println("No Of Values :"+num);
		//assertEquals(num, 10);	
		
	}
	
	@Test
	public void test002()
	{
		RestAssured.given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format", "json")
		
		.when()
		.get("/search")
		.then()
		.body("query",equalTo("ipod"));
			
		
	}
	
	@Test
	public void test003()
	{
		RestAssured.given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format", "json")
		.when()
		.get("/search")
		.then()
		.body("items.name",hasItem("Apple iPod Touch 6th Generation 16GB Refurbished"));
	}
	
	@Test
	public void test004()
	{
		RestAssured.given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format", "json")
		.when()
		.get("/search")
		.then()
		.body("items.name",hasItems("Apple iPod Touch 6th Generation 16GB Refurbished","Apple iPod touch 128GB"));
	}
	
	@Test
	public void test005()
	{
		RestAssured.given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format", "json")
		.when()
		.get("/search")
		.then()
		.body("items[0].imageEntities[0]",hasKey("entityType"));
	}
	
	
	
	
	
	
}
