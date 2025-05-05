package Web.SeleniumTestNG.javaProgramsNew;

public class largestNumber {

	public static void main(String[] args) {
		int [] arr= {5,99,2,15,1};
		
		int largestNumberToDisplay=largestNumber.largest(arr);
		System.out.println(largestNumberToDisplay);
		
	}
	public static int largest(int [] arr) {
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
