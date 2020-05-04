package proxyExample;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProxySample 
{
	public static RequestSpecBuilder rspec;
	public static RequestSpecification rp;
	
	
	@BeforeClass
	public void init()
	{
		ProxySpecification ps = new ProxySpecification("localhost", 5555, "http");
		RestAssured.baseURI = "http://localhost:8085/student";
		//RestAssured.proxy(ps);
		
		rspec = new RequestSpecBuilder();
		rspec.setProxy(ps);
		
		rp = rspec.build();
	}
	
	
	
	@Test
	public void settingsProxy()
	{
		RestAssured.given()
		.spec(rp)
		.when()
		.get("/list")
		.then()
		.statusCode(200);
	}
}
