package pratice_java;

public class Class3 {
	   public static void main(String[] args) {
	       
	       Aeroplane aero=new Aeroplane();
	       
	       aero.takeoff();
	       
	       aero.landing();
	       
	   int litres=aero.fuel();
	   
	   System.out.println(litres);
	   }
	}

	class Aeroplane
	{
	   public void takeoff()
	   {
	       System.out.println("the aeroplane is taking off...");
	   }
	   
	   
	   public void landing()
	   {
	       System.out.println("aeroplane is on the ground...");
	   }
	   
	   
	   public int fuel()
	   {
	       return 1230;
	   }
	}