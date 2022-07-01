package Assignment2;

import java.util.Scanner;

/*a program to create a room class, 
 * The attributes of this class is roomno, roomtype, roomarea and ACmachine. 
 * In this class the member
functions are setdata and displaydata.*/

public class Room {

	  private int roomNo;
	  private String roomType;
	   private Double roomArea;
	   private Boolean acMachine;
	   
	   
	   public void setData( int rmno, String rmtype, Double rmarea, Boolean acmac)
	 {
	   this.roomNo = rmno;
	   this.roomType = rmtype;
	   this.roomArea = rmarea;
	   this.acMachine = acmac;
	 }
	  public void displayData()
	  {
	    System.out.println("Room no. is:" +roomNo);
	    System.out.println("Room type is:" +roomType);
	    System.out.println("Room area is:" +roomArea);
	    System.out.println("Ac machine is:" +acMachine);
	  }
	public static void main(String[] args) {
		 Room firstroom = new Room();
		   firstroom.setData(101, "Delux", 320.0, true);
		   firstroom.displayData();
	}

}
