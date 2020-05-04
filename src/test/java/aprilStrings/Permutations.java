package aprilStrings;

import java.util.HashMap;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCS";
		int len = str.length();
		generatePermutation(str, 0, len);
		
	}
	
	public static String swapString(String s, int i,int j)
	{
		char temp;
		char[] ch = s.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	
	public static void generatePermutation(String str, int start, int end)
	{
		 if (start == end-1)  
           System.out.println(str);
			
		 else
		 {
			 for(int i=start; i<end;i++)
			 {
				 str = swapString(str,start,i);
				 generatePermutation(str,start+1,end);
				 str = swapString(str,start,i);
				 
			 }
		 }
	}

}
