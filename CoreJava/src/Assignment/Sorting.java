package Assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {

	
		public static void main(String[] args) {
			
				 
				List<Integer> nums=Arrays.asList(45,2,10,1,99,5);
				

				 Stream<Integer> strm4=nums.stream();
				 
				 
				 nums.stream().sorted().map(i->i+"").forEach(System.out::println);

			}

		

}
