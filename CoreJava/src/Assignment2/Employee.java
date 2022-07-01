package Assignment2;
/*program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named Employee
*/

public class Employee {

	int year;
	String name,address;
	
	public Employee(String name,int year, String address) {
		this.year = year;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(this.name +"\t"+this.year +"\t\t" +this.address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Robert", 1994, "64C-WallStreet");
		Employee e2 = new Employee("Sam", 2000, "68D-WallsStreet");
		Employee e3 = new Employee("John",  1999 ,  "26B- WallsStreet");
		
		System.out.println("Name" +"\t" + "Year of joining"+ "\t"+ "Address");
		e1.display();
		e2.display();
		e3.display();
	}

}
