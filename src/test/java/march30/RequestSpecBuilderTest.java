package march30;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;

public class RequestSpecBuilderTest {
	
	public static void main(String[] args) {
	
		SerializePOJO ser = new SerializePOJO();
		Location loc = new Location();
		List<String> myList = new ArrayList<String>();
		ser.setAccuracy(50);
		ser.setAddress("29 side layout");
		ser.setLanguage("en");
		ser.setPhone_number("(+91) 983 893 3937");
		ser.setWebsite("https://rahulshettyacademy.com");
		ser.setName("house");
		myList.add("shoe park");
		myList.add("shop");
		ser.setTypes(myList);
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		ser.setLocation(loc);
		
		RestAssured.baseURI = "https://rahulshettyacedemy.com";
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacedemy.com").addQueryParam("key","qaclick123").
		setContentType(ContentType.JSON).build();
		
		ResponseSpecification resp = new ResponseSpecBuilder().expectStatusCode(200).
		expectContentType(ContentType.JSON).build();
		
		RequestSpecification res = given().spec(req).body(ser);
		
		
		Response response = res.when().post("/maps/api/place/add/json").
		then().spec(resp).extract().response();
		
		String responseAsString = response.asString();
		System.out.println(responseAsString);
		
		
		
	}

}
