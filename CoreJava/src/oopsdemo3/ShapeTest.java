package oopsdemo3;

//programming for interfaces not implementation
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape=new Circle(10);
	       
        System.out.println("Using Interface :"+shape.LABLE);
       
        shape.draw();
       
        System.out.println("Area of Circle with radius  is :"+shape.getArea());
       
        //switching from one implementation to another easily
        shape=new Rectangle(10,7);
       
        shape.draw();
        System.out.println("Area of Rectangle is :"+shape.getArea());
	}

}
