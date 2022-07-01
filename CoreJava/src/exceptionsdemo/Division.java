package exceptionsdemo;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Input");
		a = input.nextInt();
		b = input.nextInt();
		
		result = a/b;//JRE throws Arithmetic Exception.
		
		System.out.println("Result = "+ result);
		input.close();
	}
}
