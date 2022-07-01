package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//>120
		Time t1=new Time(12, 60, 60);
		Time t2=new Time(10, 58, 60);
		t1.addTime(t2);
		t1.display();
		
		//60<=t<120
		Time t3=new Time(12, 45, 55);
		Time t4=new Time(10, 30, 30);
		t3.addTime(t4);
		t3.display();
		
		//less than 60
		Time t5=new Time(2, 15, 30);
		Time t6=new Time(3, 30, 25);
		t5.addTime(t6);
		t5.display();
	}
}
