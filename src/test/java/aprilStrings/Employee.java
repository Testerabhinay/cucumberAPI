package aprilStrings;

public class Employee {

	public static void main(String[] args) {
		
		Employee e1= new Employee("Ravi");

		Employee e2= new Employee("Ravi");
		                             
		if(e1.equals(e2))
		{
		System.out.println("equal");
		}
		else
		{
		System.out.println("not equal");
		}


	}
	
	public Employee(String string) {
	}

}
