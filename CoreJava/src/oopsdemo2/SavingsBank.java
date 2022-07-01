package oopsdemo2;

public class SavingsBank extends Account{
	
	private int min_bal;
	protected int balance;

	public SavingsBank(int accNo, String name, int mb,int b) {
		super(accNo, name);
// TODO Auto-generated constructor stub
		this.min_bal=mb;
		this.balance=b;
	}
	
	void display()
    {
        super.display(); // invoke super class method
        System.out.println ("Minimum Balance: "+min_bal);
        System.out.println ("Saving Balance: "+balance);
    }

}
