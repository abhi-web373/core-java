package pratice_java;

public class Sleep {

	public static void main(String[] args) {

		Animal ani = new Animal();
		
		ani.run();
	}

}
class Animal
{
	String name;
	public void run()
	{
		this.alert();
		System.out.println("Animal is running...");
	}
	public void alert()
	{
		System.out.println("Animal is alert...");
	}
}
