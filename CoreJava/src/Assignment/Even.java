package Assignment;

import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Even {

	public static void main(String[] args) {
	
		  List<Integer> nums=new ArrayList<>();
		  nums.add(10);
		  nums.add(45);
		  nums.add(30);
		  nums.add(25);
		  nums.add(86);
		  nums.add(56);
		
		  Stream<Integer> strm1=nums.stream();
		  
		  System.out.println("*The Even Numbers in the List*");
		  List<Integer> evenNums=strm1.filter(i-> i%2==0).collect(Collectors.toList());
	      System.out.println(evenNums);
	}


}

