package pratice;

public class eleventh {

	public static void main(String[] args) {
		int num=1;
		int counter=0;
		int sum=0;
		while(counter<98)
		{
			if (num%7==0) {
				System.out.println(num);
				counter++;
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);
	}
}

