package oopsdemo2;

public class Specialist extends Doctor {
	

	String speciality;

	public Specialist(int idNumber, String name, String address,String sp) {
		super(idNumber, name, address);
		// TODO Auto-generated constructor stub
		this.speciality=sp;
	}
	
	void display() 
	{
	    super.display(); // call base class method
	    System.out.println("The speciality is :" + speciality);
    }

}
