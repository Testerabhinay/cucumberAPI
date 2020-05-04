package jsonAssert.examples;

import io.restassured.RestAssured;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.*;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class JsonAssertExample 
{
	@Test
	public void getStudents() throws Exception
	{
	
	String expval = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+File.separator+"file.txt")));
	System.out.println("JSon data :"+expval);
	
	String actval = RestAssured.given().when().get("http://localhost:8085/student/list").asString();
	System.out.println("ActualJOSN : "+actval);
	
	//assertEquals(expval, actval);
	JSONAssert.assertEquals(expval, actval, JSONCompareMode.LENIENT);
	
	}
	
	@Test
	public void getStudentsStrict() throws Exception
	{
	
	String expval = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+File.separator+"different.txt")));
	System.out.println("JSon data :"+expval);
	
	String actval = RestAssured.given().when().get("http://localhost:8085/student/list").asString();
	System.out.println("ActualJOSN : "+actval);
	
	//assertEquals(expval, actval);
	JSONAssert.assertEquals(expval, actval, JSONCompareMode.STRICT);
	
	}
}
