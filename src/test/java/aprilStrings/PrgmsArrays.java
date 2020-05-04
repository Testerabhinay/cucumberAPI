package aprilStrings;

public class PrgmsArrays {
	
	public static void main(String[] args) {
		
		int[] array1 = {1,4,7,9,2};
		int[] array2 = {1,7,3,4,5};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}
	}

}
