package Web.SeleniumTestNG.javaProgramsNew;

public class sumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,12,20,30};
		int length=arr.length;
		 
		
		sumOfArray.sumOfAllArray(arr,length);
		
	}
	public static void sumOfAllArray(int[] arr, int length) {
		int sum = 0;
		for(int i=0;i<length;i++) {
			 sum= sum+arr[i];
			System.out.println(sum);
			
		}
		
	}

}
