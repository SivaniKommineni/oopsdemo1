package Assignment;
import java.util.*;
import java.util.stream.*;

public class MaxMinAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
            List<Integer> m = Arrays.asList(10,35,2,90,666,56);
            
            Stream<Integer> stream5=m.stream();
 
            
            int max =m.stream().max(Integer::compare).get();
            int min =m.stream().min(Integer::compare).get();
            
            System.out.println("The Maximum number in the List :"+max);
            System.out.println("The Minimum number in the List :"+min);
            
            
            
    }
	}

}
