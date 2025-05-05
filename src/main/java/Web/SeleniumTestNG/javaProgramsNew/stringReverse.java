package Web.SeleniumTestNG.javaProgramsNew;

import java.util.*;

public class stringReverse {
	 String stringToRev;
	 static int length1;
	
	stringReverse(String stringToRev){
		this.stringToRev=stringToRev;
	}

	public static void main(String[] args) {
		stringReverse rev=new stringReverse("madam");
		length1= rev.stringToRev.length();
		System.out.println(length1);
		StringBuffer sb= new StringBuffer("");
		for(int i=length1-1;i>=0;i--) {
			sb.append(rev.stringToRev.charAt(i));
		}
		System.out.println(sb);
		if(sb.toString().equals(rev.stringToRev)) {
			System.out.println("palindrome");
		}
		

	}
	
	

}
