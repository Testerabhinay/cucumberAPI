package fileUtils;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

	public static JsonPath rawToJson(String response)
	{
		JsonPath jsonObj = new JsonPath(response);
		return jsonObj;
	}
}
