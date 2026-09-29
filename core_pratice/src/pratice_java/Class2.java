package pratice_java;

public class Class2 {

		   public static void main(String[] args) {

		       Car one=new Car();
		       
		       one.start();
		       float num=one.trip();
		       System.out.println(num);
		       one.stop();		       
		   }

		}
		class Car
		{
		   public void start()
		   {
		       System.out.println("the car is starting.....!");
		   }
		   public void stop()
		   {
		       System.out.println("the car is stopping...");
		   }
		   
		   public float trip()
		   {
		       System.out.println("*********");
		       return 100.78f;
		       
		       
		   }
		   
		}