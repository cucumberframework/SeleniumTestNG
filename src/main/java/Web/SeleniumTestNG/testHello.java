package Web.SeleniumTestNG;

public class testHello {
	static int finalFactorialNumber=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to print factorial numbers 
		int totalFact= testHello.factorial(6);
		System.out.println("Final factorial number is -->"+totalFact);
		
	}
	public static int factorial(int factorialNumber) { 
		while(factorialNumber!=0) {
			finalFactorialNumber=(factorialNumber)*(factorialNumber-1);
			System.out.println(finalFactorialNumber);
			factorialNumber--;
		}
		return finalFactorialNumber;
		
	}

}   