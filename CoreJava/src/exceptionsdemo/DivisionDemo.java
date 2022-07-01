package exceptionsdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		int a,b ,result;
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Input");
		a = input.nextInt();
		
		b = input.nextInt();
		
		try {
			result = a/b;
			System.out.println("Result = "+ result);
		}
		catch(ArithmeticException e) //Exception thrown is handled in catch block.
		{
			System.out.println("Divide by Zero Error - Enter non-zero value");
			System.out.println("Exception Name & description : " + e.getMessage());
			System.out.println("Exception Name & description : " + e.toString());
			//Details abt exception Name , Description, Line number of code which generated Exception
			e.printStackTrace();
		}
		finally { // Clean - up code
			input.close();
			System.out.println("In Finally Block - Program execution ended");
			
		}
	}
}
