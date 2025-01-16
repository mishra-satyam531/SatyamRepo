package oops;

class Account{
	//Data Security
	private double balance = 500;	
	
	//methods :: public
	public double getBalance(double withdraw) {
		//perform authentication
		boolean result = validate("Satyam", "satyam123");
		
		//withdrawing the money
		if(result && this.balance >= withdraw) {
			this.balance -= withdraw;
			return withdraw;
		}
		else {
			System.out.println("Invalid username / password, please try again");
			return 0;
		}
	}
	
	//methods :: public
	public void setBalance(double deposit) {
		//perform authentication
		boolean result = validate("Satyam", "satyam123");
		
		//depositing the money
		if(result) {
			this.balance += deposit;
			System.out.println("Credited to the account " + deposit);
			System.out.println("Updated balance is " + this.balance);
		}
		else {
			System.out.println("Invalid username / password, please try again");
		}
	}
	
	//methods :: private
	private boolean validate(String username, String password) {
		//logic for authentication
		return username.equalsIgnoreCase("satyam") && password.equals("satyam123"); 
	}
}

public class TestApp{
	public static void main(String[] args) {
		Account acc = new Account();
//		System.out.println(acc.balance); cannot access directly
			
		acc.setBalance(1000);
		
		double withDrawn = acc.getBalance(500.5);
		System.out.println("Withdrawing " + withDrawn + " amount");
	}
}