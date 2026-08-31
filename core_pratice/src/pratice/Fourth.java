package pratice;

public class Fourth {

	public static void main(String[] args) {
		
		double marks= 85.00;
		
		if(marks>=35 && marks<=50){
			System.out.println("C Grade");
		}
		else if(marks>=51 && marks<=60){
			System.out.println("B Grade");
		}
		else if(marks>=61 && marks<=74){
			System.out.println("A Grade");
		}
		else if(marks>=75 && marks<=100){
			System.out.println("A+ Grade");
		}
		else{
			System.out.println("Either fail or Invaild marks");
		}
	}

}
