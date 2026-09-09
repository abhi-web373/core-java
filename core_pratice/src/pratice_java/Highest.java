package pratice_java;

public class Highest {

	public static void main(String[] args) {
			
			int[] arr= {1,22,55,4,7,3,88,100};
			
			int lowest=0;
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>lowest) {
					
					lowest=arr[i];
				}
					
			}System.out.println(lowest);
		}

	}
