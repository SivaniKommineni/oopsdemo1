package oopsdemo3;

public class Marks extends Trainee{

	public double marks;
	
	public Marks(String name, String address, int number,double m) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
		this.marks = m;
	}

	@Override
	public double calculateMarks() {
		// TODO Auto-generated method stub
		System.out.println("Calculate Marks : ");
		return (marks*2);
	}
	

}
