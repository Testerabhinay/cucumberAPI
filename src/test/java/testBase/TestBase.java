package testBase;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
	
	/*@BeforeClass
	public void init()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8085;
		RestAssured.basePath = "/student";
	}*/
	
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "http://api.walmartlabs.com";
		RestAssured.basePath = "/v1";
	}
	
}
