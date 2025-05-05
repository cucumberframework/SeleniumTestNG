package Web.SeleniumTestNG.javaProgramsNew;

import java.util.HashMap;
import java.util.Map;

public class charCountConsecutive {

	public static void main(String[] args) {
		String initialString = "aaabbbcccaaaaa";
		char[] arr = initialString.toCharArray();
		Map<Character, Integer> mapArr = new HashMap<Character, Integer>();

		StringBuilder str= new StringBuilder();
		int initialValue=1;
		for(char indChar:arr) {
	if(mapArr.get(indChar)==0) {
		mapArr.put(indChar, initialValue);
	}else {
		int newVal=mapArr.get(indChar)+1;
		mapArr.put(indChar, newVal);
	}
	
}
	}

}
