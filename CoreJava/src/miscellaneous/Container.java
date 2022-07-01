package miscellaneous;

public class Container<T> {

	private T t;
	
	public void add(T t) {
        this.t = t;
     }

     public T get() {
        return t;
     }
	
	public static void main(String[] args) {

		Container<String> strContainer = new Container<String>();
		Container<Integer> intContainer = new Container<Integer>();
		Container<Double> dContainer = new Container<Double>();
		Container<Character> chrContainer = new Container<Character>();
		strContainer.add("James Gosling");
		intContainer.add(1000);
		dContainer.add(50000.55);
		chrContainer.add('A');
		
		System.out.println("The String Value is : " + strContainer.get());
		System.out.println("The Integer Value is : " + intContainer.get());
		System.out.println("The Double Value is : " + dContainer.get());
		System.out.println("The Character Value is : " + chrContainer.get());
	}

}
