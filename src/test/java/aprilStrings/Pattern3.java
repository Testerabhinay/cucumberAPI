package aprilStrings;

public class Pattern3 {

	public static void main(String[] args) {
		
		int n=8;
		for(int i=1;i<n;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
