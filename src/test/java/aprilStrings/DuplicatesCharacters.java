package aprilStrings;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesCharacters {

	public static void main(String[] args) {
		
		String str = "testing";
		Set<Character> set = new HashSet<Character>();
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(set.add(c[i])==false)
			{
				System.out.println("Duplicate :"+c[i]);
			}
		}

	}

}
