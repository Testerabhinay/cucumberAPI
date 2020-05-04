package march30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


//This program is for counting the no of characters in a sentence
public class Samplestrings {

	public static void main(String[] args) {
		
		int k=0;
		//String str = "This this is is done by Saket Saket";
		/*String[] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			String ab = s[i];
			char[] c = ab.toCharArray();
			for(int j=0;j<c.length;j++)
			{
				char ch = ab.charAt(j);
				k++;
			}
		}
		System.out.println(k);
		
		*/
		
		// Counting no of words in a sentence
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		String str = "stress";
		for(char c : str.toCharArray())
		{
			if(map.containsKey(c))
			{
				int val = map.get(c);
				map.put(c, val+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		
		
		
		
	}

}
