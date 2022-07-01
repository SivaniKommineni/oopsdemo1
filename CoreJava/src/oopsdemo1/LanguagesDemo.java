package oopsdemo1;
//Constructors

class Language{
	private String s;
	private int version;
	
	Language() // Implicit /No - Args Constructor
	{ 
		System.out.println("I am an Implicit Constructor");
		s = " Python";
		System.out.println("Hello from :" +s);
	}
	
	Language(String lang) //Parameterized Constructor
	{
		System.out.println("I am parameterized Constructor");
		this.s = lang;
		System.out.println("Hello from : " + s);
	}
	
	Language(String lang,int ver) // Parameterized Constructor with 2 args
	{
		System.out.println("I am a Parameterized Constructor");
		this.s = lang;
		this.version = ver;
		System.out.println("Hello from :" +s+ "V. " + version);
	}
}

public class LanguagesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Language l1 = new Language();
		Language l2 = new Language();
		Language l3 = new Language("Ruby");
		Language l4 = new Language("Scala");
		Language l5 = new Language("Java",2);

     
	}

}
