package pratice;

public class nineth {

	public static void main(String[] args) {
	
		int num=1;
		int counter=0;
		int sum=0;
		
		while(counter<123)
		{
			if (num%3!=0) {
				System.out.println(num);
				counter++;
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);
	}

}
