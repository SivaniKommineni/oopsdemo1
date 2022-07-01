package exceptionsdemo;

public class ThrowsDemo {

	void Division() throws ArithmeticException{
		int a = 45,b = 0,rs;
		
		rs = a/b;
		System.out.println("\n\t The result is : " + rs);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsDemo T = new ThrowsDemo();
		try
		{
			T.Division();
		}
		catch(ArithmeticException ex) {
			System.out.println("\n\tError : " + ex.getMessage());
			
		}
		System.out.println("\n\tEnd of program.");
		}

}
