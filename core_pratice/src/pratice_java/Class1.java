package pratice_java;

public class Class1 {

	public static void main(String[] args) {
		
		Student first = new Student();
		
		first.name="Abhi";
		first.moblienumber="547896321";
		first.rollnumber=55;
		first.gender='M';
		
		System.out.println(first.name);
		System.out.println(first.moblienumber);
		System.out.println(first.rollnumber);
		System.out.println(first.gender);
		
		System.out.println("---------------------------------");
		
		Student second = new Student();
		
		second.name="Tanvii";
		second.moblienumber="547896322";
		second.rollnumber=56;
		second.gender='F';
				
		System.out.println(second.name);
		System.out.println(second.moblienumber);
		System.out.println(second.rollnumber);
		System.out.println(second.gender);
		
		System.out.println("----------------------------------");
		
		GT RoyalFiled = new GT(); 
		
		RoyalFiled.name="GT";
		RoyalFiled.color="red";
		RoyalFiled.average="25km/ltr";
		RoyalFiled.cc=600;
		
		System.out.println(RoyalFiled.name);
		System.out.println(RoyalFiled.color);
		System.out.println(RoyalFiled.average);
		System.out.println(RoyalFiled.cc);
	}
	
}
class Student
{
	String name;
	String moblienumber;
	int rollnumber;
	char gender;
	
}

class GT
{
	String name;
	String color;
	String average;
	int cc;
	
}

