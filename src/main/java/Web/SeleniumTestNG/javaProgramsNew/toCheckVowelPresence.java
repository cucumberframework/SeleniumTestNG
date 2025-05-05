package Web.SeleniumTestNG.javaProgramsNew;

public class toCheckVowelPresence {

	public static void main(String[] args) {
		//a, e ,i ,o, u
		String vovelString="vv";
		char[] chArray= vovelString.toCharArray();
		toCheckVowelPresence vov= new toCheckVowelPresence();
		boolean flag=vov.checkVov(chArray);
		System.out.println("VovelString???---"+flag);

	}
	public boolean checkVov(char [] arrayCh) {
		boolean finalFlag = false;
		for(char ch:arrayCh) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
				 finalFlag=true;
			}
		
		}
		return finalFlag;
		
	}
	
	

}
