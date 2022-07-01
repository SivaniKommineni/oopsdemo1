package oopsdemo3;

class SoftwareEngineer{
	protected String name,tech;
	double salary;
	
	public SoftwareEngineer(String bame, String tech, double salary) {
		this.name = bame;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void display()
	{
		System.out.println(name + " " + tech+ " " + salary );
	}
	void work() {
		System.out.println("Coding & Test");
	}
}

class Developer extends SoftwareEngineer{

	public Developer(String bame, String tech, double salary) {
		super(bame, tech, salary);
		// TODO Auto-generated constructor stub
	}
	
	void work() {
		System.out.println("Coding using : " + tech);
	}
	
}
class Tester extends SoftwareEngineer{

	public Tester(String bame, String tech, double salary) {
		super(bame, tech, salary);
		// TODO Auto-generated constructor stub
	}
	void work() {
		System.out.println("Testing using : " + tech);
	}
	
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftwareEngineer s1 = new SoftwareEngineer("Navin","Java Full Stack",3500);
		
		Developer d1 = new Developer("Gosling", "Java",2500);
		Tester t1 = new Tester("Mike", "JMeter",2000);
		
		s1.display();
		s1.work();
		
		d1.display();
		d1.work();
		
		t1.display();
		t1.work();

	}

}
