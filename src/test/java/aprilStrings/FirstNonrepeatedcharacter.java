package aprilStrings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonrepeatedcharacter {

	public static void main(String[] args) {
	
		String str = "testienigsg";
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(char c :str.toCharArray())
		{
			if(map.containsKey(c))
			{
				int val = map.get(c);
				map.put(c, val+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(map.get(ch)==1)
			{
				System.out.print(ch);
			}
			
		}
		
	}

}
