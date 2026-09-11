package pratice_java;

public class primenumber {

	   public static void main(String[] args) {
	       
	       int number=1;
	       
	       boolean flag =false;
	       
	       for(int i=2;i<=12;i++)
	       {
	           if(number % i ==0)
	           {
	               flag=true;
	           }
	           
	       }
	       if(!flag)
	       {
	           System.out.println("PRIME");
	       }
	       else
	       {
	           System.out.println("NON PRIME");
	       }
	   }
}
