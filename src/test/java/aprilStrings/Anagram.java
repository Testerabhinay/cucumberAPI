package aprilStrings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "now";
		String s2 = "own";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		
		Arrays.sort(c2);
		//System.out.println(Arrays.equals(c1, c2));
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				System.out.println("Anagram");
			}
		}
		
	}

}
