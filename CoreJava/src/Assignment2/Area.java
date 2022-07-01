package Assignment2;

import java.util.Scanner;

/*program to print the area of a rectangle by creating a class named Area 
 * taking the values of its length and breadth as parameters of its method and having a method named
returnArea which returns the area of the rectangle.
   Length and breadth of rectangle are entered through keyboard.
*/
public class Area {

	int length,breadth;

	
	int returnArea(int l,int b) {
		this.length =l;
		this.breadth = b;
		return l*b;
	}
	
	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("Enter Values of Length and Breadth: ");
		Scanner s = new Scanner(System.in);
		a.length = s.nextInt();
		a.breadth = s.nextInt();
		s.close();
		int b = a.returnArea(a.length, a.breadth);
		System.out.println("Area of Rectangle is : " +b);

	}
}
