package march30;

import fileUtils.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testData.Payload;

public class DynamicJson {
	
	@Test(dataProvider="BookDetails")
	public void addBook(String isbn,String asile)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().headers("Content-Type","application/json").
		body(Payload.addBook(isbn,asile))
		.when()
		.post("/Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath jsonObj = ReusableMethods.rawToJson(response);
		String id = jsonObj.get("ID");
	}
	
	
	@DataProvider(name = "BookDetails")
	public Object[][] getData()
	{
		return new Object[][]{{"Book4","104"},{"Book5","105"},{"Book6","10"}};
	}

}
