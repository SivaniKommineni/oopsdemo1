package oopsdemo3;
//Upcasting is used when you want to generalise a function or 
//property so that it can be used by any of it's type
class Game {
	public void play(){
	System.out.println("Game is being played"); 
	}
	public void noOfplayers() {
	System.out.println("No of players depend upon the game" ) ; 
	}

	public void winner (String name) {
	System.out.println("Winner is : " +name) ;
	}	
}

class Cricket extends Game{

	public void noofPlayers() {
		System.out.println("22");
	}
	
	public void teams () { 
	    System.out.println("2") ;
	}
}


class Chess extends Game{

public void noofPlayers(){ 
	System.out.println("2");
}
}



public class UpCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Cricket();
		Game g1 = new Chess();
		
		g.play();
		g.noOfplayers();
		g.winner("A");
		//g.teams(); // Compiler error
		
		Cricket c = new Cricket(); //static binding
		c.teams();
		
		g1.play();
		g1.noOfplayers();
		
		System.out.println("**********************");
		
		Game g100;
		//upcasting

		g100 = new Cricket(); //upcasting
		g100.play();
		g100.noOfplayers() ;
		g100.winner("DC");
		
		g100 = new Chess();
		g100.play();
		g100.noOfplayers();
		g100.winner("Vishwanthan Anannd");

		System.out.println("**************************");
		
	}

}
