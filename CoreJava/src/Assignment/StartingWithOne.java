package Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StartingWithOne {

public static void main(String[] args) {
			
			List<Integer> nums=new ArrayList<>();
		
			nums.add(2000);
			nums.add(1000);
			nums.add(1999);
			nums.add(3001);
			nums.add(5000);
			nums.add(1666);
			nums.add(9999);
			nums.add(-1999);
			
			Stream<Integer> strm2=nums.stream();
			
			System.out.println("**The numbers starting with 1 in the List***");
		   nums.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
			


	}

}
