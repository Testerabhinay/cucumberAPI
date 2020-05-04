package march30;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SerializeTest {
	
	public static void main(String[] args) {
	
		RestAssured.baseURI = "https://rahulshettyacedemy.com";
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
		
		
		Response res = given().queryParam("key","qaclick123").body(ser).when()
		.post("/maps/api/place/add/json").then().assertThat().statusCode(200).extract().response();
		
		String responseAsString = res.asString();
		System.out.println(responseAsString);
		
		
		
	}

}
