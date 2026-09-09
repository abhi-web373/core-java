package pratice_java;

public class Lowest {

	public static void main(String[] args) {
		
		int[] arr= {102,225,555,4747,775,656,88};
		
		int highest= Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<highest) {
				
				highest=arr[i];
			}
				
		}System.out.println(highest);
	}

}