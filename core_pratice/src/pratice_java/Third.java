package pratice_java;

public class Third {

	   public static void main(String[] args) {
	       
	       int[] arr= {10,30,0,7,6,0,78,0};
	       //3
	       int[] arr2=new int[arr.length];
	       
	   //    int counter=3;

	       int nonzero=0;
	       for(int j=0;j<arr.length;j++)
	       {
	           
	           if(arr[j]!=0)
	           {
	               arr2[nonzero]=arr[j];
	               nonzero++; 
	               System.out.println("NZ"+nonzero);
	               
	           }
	       }
	       System.out.println(nonzero);
	      // System.out.println(arr2[4]);
	       
	       while(nonzero<arr.length-1)
	       {
	           arr2[nonzero]=0;
	           nonzero++;
	       }
	       
	       for(int i:arr2)
	       {
	          // System.out.print(i+" ");
	           //System.out.println("*");
	       }
	   }
	   

	}
