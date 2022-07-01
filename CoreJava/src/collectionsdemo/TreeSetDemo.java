package collectionsdemo;

import java.util.Comparator;
import java.util.TreeSet;

// Treeset sorts elements in ascending order
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
       
        TreeSet<Integer> tset2=new TreeSet<>();
        
        tset2.add(222);
        tset2.add(242);
        tset2.add(100);
        tset2.add(88);
        tset2.add(3);
        tset2.add(242);

        System.out.println(tset2);
        
        //tree set with custom comparator
        TreeSet<Integer> tset3 = new TreeSet<Integer>(Comparator.reverseOrder());
        
        tset3.add(454);
        tset3.add(100);
        tset3.add(45);
        tset3.add(678);
        tset3.add(456);
        tset3.add(29);
        System.out.println(tset3);

        
        

	}

}
