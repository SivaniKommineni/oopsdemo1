package Assignment;

@FunctionalInterface
interface PO
{
	double getvalue();
}
public class LambdaValue {

	public static void main(String[] args) {
	
		PO val=() ->{ return 3.145 ;
		};
		System.out.println(val.getvalue());
	}

}