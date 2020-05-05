package aprilStrings;

public class UpperLower {

	public static void main(String[] args) {
		
	//String str = "Testing";
	//char[] ch = str.toCharArray();
	//System.out.println("Hello :"+str.toUpperCase());
	
	/*char character = 'a';
	System.out.println((int) character);
	
	System.out.println((char) 97);*/
	
	/*for(char c : str.toCharArray())
	{
		if(c>64 && c < 91)
		{
			c = (char)(c + 32);
			
		}
		else if(c>95 && c<122)
		{
			c = (char)(c- 32);
		}
		System.out.println(c);
	}
	*/
		
		String str = "The tImes oF WoRlD";
		char[] c = str.toCharArray(); 
		   
		   for(int j=0;j<c.length;j++)
		   {
			  if(c[j]>64 && c[j]<91)
			   {
				   c[j] = (char)(c[j] + 32);
			   }
			   else if(c[j]>96 && c[j]<122)
			   {
				   c[j] = (char)(c[j] -32);
			   }
			   
			 }
		   System.out.print(c);
		 }


}
