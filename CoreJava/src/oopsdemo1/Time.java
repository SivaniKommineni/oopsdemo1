package oopsdemo1;
/* Java program to perform addition of 2 Times 
 * t1 --> 12 : 45 :55 * t2 --> 10 : 30 :30 
 * t1 + t2 
 * if sec> 60 .. mins should be incremented & sec -60,
 * if min> 60 ... hrs should be incremented & min -60 */

public class Time {
	
	private int hours;
	private int min;
	private int sec;
	int c;
	
	public Time(int hours, int min, int sec) {
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}


	void addTime(Time t2) {
		sec=this.sec+t2.sec;
		sec=returnValue(sec);
		min=this.min+t2.min+c;
		min=returnValue(min);
		hours=this.hours+t2.hours+c;
	}

	int returnValue(int n) {
		c=0;
		if(n<60) {
			return n;
		}
		else if(n>=60 && n<120) {
			c++;
			return n-60;
		}
		else {
			c+=2;
			return 120-n;
		}
	}
	
	void display() {
		System.out.printf("final added time is: %d : %d : %d",hours,min,sec).println();
	}
}