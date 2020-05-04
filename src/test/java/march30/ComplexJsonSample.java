package march30;

import io.restassured.path.json.JsonPath;
import testData.Payload;

public class ComplexJsonSample {
	
	public static void main(String args[])
	{
		JsonPath json = new JsonPath(Payload.coursePrice());
		int count = json.getInt("courses.size()");
		System.out.println("courses count :"+count);
		
		int purchaseAmount = json.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		//Title of the first course
		String title = json.getString("courses[0].title");
		System.out.println(title);
		
		// To Print all the titles
		for(int i=0;i<count;i++)
		{
			String titles = json.getString("courses["+i+"].title");
			System.out.println("All titles :"+titles);
		}
		
		// print no of copies sold by RPA
		int copiesCount = json.getInt("courses[2].copies");
		System.out.println(copiesCount);
		
		int price=0;
		int copies = 0;
		int totalSum =0;
		int val =0;
		for(int i=0;i<count;i++)
		{
			price = json.get("courses["+i+"].price");
			copies = json.get("courses["+i+"].copies");
			System.out.println("Sum Of Pries:"+price*copies);
		
			totalSum = price*copies;
			val = val + totalSum;
		}
		
		System.out.println(val);
		
		
		
	}
}
