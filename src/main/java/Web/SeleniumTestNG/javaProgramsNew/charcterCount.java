package Web.SeleniumTestNG.javaProgramsNew;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;

public class charcterCount {

	public static void main(String[] args) {
		String str= "hello this is the number array format";
		char [] charArray= str.toCharArray();
		charcterCount count = new charcterCount();
				count.charCount(charArray);
	}
	
	
	public void charCount(char[] charArray) {
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		int counter=1;
		for(char ch:charArray) {
			if(!(map.containsKey(ch))) {
				map.put(ch, counter);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map);
		
	}

}
