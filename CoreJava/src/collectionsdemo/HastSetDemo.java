package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

//set is a Unordered group of elements which stores a unique value 
public class HastSetDemo {

	public static void main(String[] args) {

		Set<String> programminglanguages = new HashSet<>();
		
		programminglanguages.add("C");
		programminglanguages.add("C++");
		programminglanguages.add("Java");
		programminglanguages.add("Python");
		programminglanguages.add("PHP");
		programminglanguages.add("Ruby");
		
		programminglanguages.add("Java");
		programminglanguages.add(null);
		programminglanguages.add(null);
     

		   System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
	        for(String programmingLanguage: programminglanguages) {
	            System.out.println(programmingLanguage);
	        }

	        HashSet<String> pl = new HashSet<>(programminglanguages);
	        
	        System.out.println(pl);
	        
	        HashSet<String> clonepl = new HashSet<>();// empty hash set
	        
	        // clone the Hashset
	        clonepl=(HashSet<String>) pl.clone();
	        
	        //display new set after cloning
	        System.out.println(clonepl);
	}

}
