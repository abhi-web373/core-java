package pratice_java;

public class Constructors {

	public static void main(String[] args) {
		
		bike bmw = new bike(5);
		bmw.mileage=20;
		System.out.println(bmw.mileage);
	}
}
class bike
{
	int mileage;
	public bike() {
	System.out.println("===========");
}
	public bike(int i) {
		System.out.println("********************");
	}
}