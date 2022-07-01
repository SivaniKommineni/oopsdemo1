package oopsdemo1;

public class ConstructorDemo {

	
		// TODO Auto-generated method stub
		 int id; 
		 String name; 
		 float salary;
		 
		 ConstructorDemo()
		 {
			 System.out.println("Iam Implicit Constructor");
			 id = 101;
			 name = "Mike";
			 salary = 5000.00f;
		 }

		// generate Constructor with arguments 
			// In a new Line Right Click -> Source -> Generate Constructor using Fields 
		    // --> Select All --> Generate Button

		public ConstructorDemo(int id, String name, float salary) {
			System.out.println("Tam a parameterized Constructor");
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		void display() 
		{ 
			System.out.println(this.id+ " "+this.name+" "+this.salary); 
		} 
		
	
    public static void main(String [] args) {
        ConstructorDemo cd1=new ConstructorDemo(); // invokes implicit Constructor 
        ConstructorDemo cd2=new ConstructorDemo(102,"John",6000.00f); // invoke parameterized constructor 
        ConstructorDemo cd3=new ConstructorDemo(); 

        cd1.display(); 
        cd2.display();
        cd3.display();

	
}
}
