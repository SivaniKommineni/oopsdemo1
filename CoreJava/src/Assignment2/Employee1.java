package Assignment2;

import java.util.Scanner;

/*
 *program by creating an &#39;Employee1&#39; class having the following methods and print
the final salary.
1 - getInfo(); which takes the salary, number of hours of work per day of employee as
parameter
2 - AddSal(); which adds $10 to salary of the employee if it is less than $500.
3 - AddWork() which adds $5 to salary of employee if the number of hours of work per
day is more than 6 hours.
 */
public class Employee1 {
	
	int salary,hours;
	void getInfo(int sal,int h) {
		this.salary = sal;
		this.hours =  h;
	}
	void AddSal() {
		if(salary<500) {
			salary += 10;
		}	
	}
	void AddWork() {
		if(hours>6)
			salary += 5;
	}
	void display() {
		System.out.println("Total Salary : " + salary +" $");
	}

	public static void main(String[] args) {
		
		int salary,noOfHours;
		System.out.println("Enter Salary and Number of Hours per day");
		
		Scanner s = new Scanner(System.in);
		salary = s.nextInt();
		noOfHours = s.nextInt();
		s.close();
		
		Employee1 a = new Employee1();
		
		a.getInfo(salary,noOfHours);
		a.AddSal();
		a.AddWork();
		a.display();
		}
}
