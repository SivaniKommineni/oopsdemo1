package exceptionsdemo;

public class ThrowExample {

	public static void checkEligibility(int age,int weight)
	{
		if(age<12 || weight<40) {
			throw new ArithmeticException("Student is not eligible" );
		}
		else {
			System.out.println("Student with age : " + age+ " and with weight "+weight+" is Eligible");
		}
	}
	public static void main(String[] args) {

		System.out.println("welcome to sports ");
		checkEligibility(20, 45);
		System.out.println("Thank You");
		checkEligibility(11, 23);
	}

}
