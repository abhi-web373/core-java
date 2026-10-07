package pratice_java;

public class Constructors1 {

	public static void main(String[] args) {
		
		Bus tata = new Bus(45,"pp");
		System.out.println(tata.mileage);
		System.out.println(tata.driver);
	}
}
class Bus
{
	int mileage;
	String driver;
	
	public Bus(int num,String Driver_name)
	{
		this.mileage=num;
		this.driver=Driver_name;
		
	}
}