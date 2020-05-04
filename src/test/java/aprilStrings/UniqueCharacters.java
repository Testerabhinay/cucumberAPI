package aprilStrings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
	public static void main(String[] args) {
		
		
		//Two ways to do this, one way use HashSet second way is the below one
		String s = "Alive is awesomeA";
		Set<Character> set = new HashSet<Character>();
		boolean result = false;
		for(char ch : s.toCharArray())
		{
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				result = true;
				System.out.println("Unique");
				break;
			}
			else
			{
				result = false;
				System.out.println("Common");
				break;
			}
		}
		
	}

}
