package oopsdemo2;

//parent/base/super class
class Animal
{
String name; //properties

public void eat()   // methods
{
	System.out.println("I can Eat");
}
}

//Inherits Animal class 
//Child/ Sub/ Derived Class
class Dog extends Animal
{
public void display()
{
	System.out.println("My Name is : "+name);
}
}

public class SingleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create & initialize Object of Sub Class
				Dog labrador=new Dog();
				
				//access field of super class
				labrador.name="Zimba";
				
				//call method of derived class using derived class object
				labrador.display();
				
				// call method of super class using derived class object
				labrador.eat();

	}

}
