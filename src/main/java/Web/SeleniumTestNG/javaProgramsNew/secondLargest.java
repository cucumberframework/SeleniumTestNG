package Web.SeleniumTestNG.javaProgramsNew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class secondLargest {

	public static void main(String[] args) {
		int[] arr = { 100, 20, 99, 2 };
		List<Integer> arr1 = new ArrayList<Integer>();
		for (int ind : arr) {
			arr1.add(ind);
		}
		secondLargest test = new secondLargest();
		int second = test.secondLagest(arr1);
		System.out.println("SecondMax--"+second);
	}

	public int secondLagest(List<Integer> arr2) {
		int arraySize = arr2.size();
		int secondMax = 0;
		int max = 0;
		for (int i = 0; i < arraySize; i++) {
			if (arr2.get(i) > max) {
				max = arr2.get(i);
			}
			if(i!=0 && arr2.get(i)>arr2.get(i-1)) {
				secondMax=arr2.get(i-1);
				
			}
		}
		return secondMax;
	}

}
