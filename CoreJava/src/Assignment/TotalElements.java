package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TotalElements {

	public static void main(String[] args) {
		

		List<String> n=Arrays.asList("Sai","Surya","Sunil","Pavan","Saketh");
		
		 Stream<String> strm3=n.stream();
		 
		 
		  long count=n.stream().count();
		  System.out.println("Total no. of elements :"+count);

	}

}