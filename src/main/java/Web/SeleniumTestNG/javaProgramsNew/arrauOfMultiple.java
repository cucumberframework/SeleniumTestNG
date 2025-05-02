package Web.SeleniumTestNG.javaProgramsNew;

import java.util.ArrayList;
import java.util.List;

public class arrauOfMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
		arrauOfMultiple.arrayOfMultipleElement(7,5);
		
	}
	public static void arrayOfMultipleElement(int baseValue, int iterateFor) {
		List<Integer> newList=new ArrayList();
		
		for(int i=1; i<=iterateFor;i++) {
			int finalValue= baseValue*i;
			System.out.println(finalValue);
			newList.add(finalValue);
			
		}
		System.out.println(newList);
	}

}
