package oopsdemo2;
//child class - Single Inheritance -is a relationship
public class Developer extends Employee 
{
    String technology;
    
    //derived class constructor
	public Developer(int empId, String name, String t) {
		super(empId, name); // calls Employee base class constructor
		// TODO Auto-generated constructor stub
		this.technology = t;
	}
	
	void display1() 
	{ 
		System.out.println("Technology Used: "+technology); 
    }
	

}
