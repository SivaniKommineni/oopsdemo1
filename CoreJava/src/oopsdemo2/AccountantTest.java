package oopsdemo2;
//Program to implement Single Inheritance.
public class AccountantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accountant ac1 = new Accountant(201, "Gaurav Sharma", "Process Salary of Employees", "SAP");
		Accountant ac2 = new Accountant(205, "Mary", "Payment to Vendors","Tally");
		
		ac1.display();
		ac2.display();

	}

}
