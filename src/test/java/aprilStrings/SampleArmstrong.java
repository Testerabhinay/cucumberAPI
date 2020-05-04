package aprilStrings;

public class SampleArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 371, rem=0,m=0;
		while(n>0)
		{
			rem = n%10;
			n = n/10;
			m = m+(rem*rem*rem);
		}
		System.out.println(m);
		
		
		
		
	}

}
