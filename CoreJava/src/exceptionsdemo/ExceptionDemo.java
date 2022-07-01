package exceptionsdemo;

//General exception Handling
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String languages[]= {"C", "C++" , "Java","Perl","Python"};

    try {
	
    	for(int i = 0;i<=5;i++) {
    		System.out.println(languages[i]);
    	}
    }
    catch(Exception ex) {
    	System.out.println(ex);
    }
	}

}
