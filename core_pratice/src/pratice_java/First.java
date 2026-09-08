package pratice_java;

public class First {

	public static void main(String[] args) {
		
		int counter=0;
		int sum=0;
		for(int i=1;i<1234;i++) {
			if(i%2==0) {
			System.out.println(i);
			counter++;
			sum++;
			}
		}
		
		System.out.println("Counter:"+counter);
		System.out.println("Sum:"+sum);
	}

}
