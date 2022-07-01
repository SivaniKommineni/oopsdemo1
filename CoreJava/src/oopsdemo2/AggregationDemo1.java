package oopsdemo2;

public class AggregationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Author author = new Author("John", 42, "USA");
		
	    Publisher publisher = new Publisher("Sun Publication","JDSR-III4", "LA");
	    
	    Book100 b = new Book100("Java for Begginer", 800, author, publisher);
	    
	    b.display();
	}

}
