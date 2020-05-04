package aprilArrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		String str = "HCL";
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev + ch[i];
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not" + rev);
		}
	}

}
