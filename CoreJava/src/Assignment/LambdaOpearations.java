package Assignment;


@FunctionalInterface
interface Odd
{
    boolean PerformOpeartionisOdd(int n); 
}

		 
public class LambdaOpearations {

			public static void main(String[] args) {
				
				
				Odd odd=(n) ->
				{ 
					if(n%2!=0)
						return true;
					else
						return false;
					
				};
				System.out.println(odd.PerformOpeartionisOdd(5));
				
				
		@FunctionalInterface
		interface Prime
		{
			boolean PerformOperatonsisPrime(int m);
			
		}
		Prime prime=(m) ->
		{ 
			for (int i = 2; i <= m / 2; i++) {
			    if (m % i == 0)
			     return false;
			   }
			   return true;

		};	

			System.out.println(prime.PerformOperatonsisPrime(6));
			
			
		@FunctionalInterface
		interface Palindrome
		{
			boolean PerformOperatonsisPalindrome(int p);

		}
		Palindrome palindrome =(p) ->
		{
			return Integer.toString(p)
		    .equals(new StringBuilder(Integer.toString(p))
		      .reverse().toString());
		};
		System.out.println(palindrome.PerformOperatonsisPalindrome(111));
			
		
	}

}
