package march30;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import fileUtils.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.Test;

import testData.Payload;

public class StaticJson {
	
	@Test
	public void addBook() throws Exception
	{
		
		RestAssured.baseURI = "http://216.10.245.166";
			String response = given().headers("Content-Type","application/json").
			body(GenerateStringFromResource("D:\\new learning\\restAutomationWorkspace\\WorldRestAssured\\src\\test\\resources\\sample.json.txt"))
			.when()
			.post("/Library/Addbook.php")
			.then().assertThat().statusCode(200)
			.extract().response().asString();
			
			JsonPath jsonObj = ReusableMethods.rawToJson(response);
			String id = jsonObj.get("ID");
		}
	
	public static String GenerateStringFromResource(String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
	
	

}
