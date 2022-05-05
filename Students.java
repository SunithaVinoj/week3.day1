package week3.day1;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("Get the Student Info by not passing any argument");
	}

	public void getStudentInfo(int id )
	{
		System.out.println("Get the Student Info by passing only ID : " +id );	
	}
	
	public void getStudentInfo(int id ,String name)
	{
		System.out.println("Get the Student Info by passing ID and Name : " +id +" "+name);
	}
	
	public void getStudentInfo(String email , long phoneNumber)
	{
		System.out.println("Get the Student Info by passing email and phonenumber : "+ email + " "+phoneNumber);
	}
	
	public static void main(String[] args) 
	{
		Students students = new Students(); 
		System.out.println("Example for Method Overloading");
		students.getStudentInfo();
		students.getStudentInfo(123);
		students.getStudentInfo(123, "TestLeaf");
		students.getStudentInfo("testleaf@gmail.com", 1234567890);
	} 
	
	
}
