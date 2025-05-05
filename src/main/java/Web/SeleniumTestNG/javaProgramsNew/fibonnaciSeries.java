package Web.SeleniumTestNG.javaProgramsNew;

public class fibonnaciSeries {

	public static void main(String[] args) {
//program to generate fibonnaci series first then find all sum of even numbers 
		
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ……

		fibonnaciSeries.series(10);
	}
	
	public static void series(int input) {
		 int i=0;
		 int j=1;
		 int k;
		 System.out.print("0,"+"1,");
		 for(int l=1;l<=input;l++) {
			 	
				 k=i+j;
				 i=j;
				 j=k;
				 System.out.print(+i+",");
				 	 
		 }	
	}
}
