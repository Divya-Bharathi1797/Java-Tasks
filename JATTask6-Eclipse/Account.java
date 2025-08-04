package JATTask6;

public class Account {
	String name;
	int accountno;
	double balance=2000.0;
	double amount;
	
	public Account() {
		System.out.println("No Arg constructor");		
	}
	
	public Account(String name, int accountno) {
		this.name=name;
		this.accountno=accountno;
		this.balance=2000.0;
		System.out.println("Parameterized constructor");
	}
	
	public void withdraw(double amount) {
		if (balance<amount) {
			System.out.println("Insufficient Balance");
		}
		else if (balance>amount) {
			balance=balance-amount;
			System.out.println("Withdrawl amount is " + amount + " and available balance is " + balance);
		}
		else if (amount<=0) {
			 System.out.println("Invalid withdraw amount");
		}		
	}
    public void deposit(double amount) {
    	if(amount>0) {
    		balance= balance+ amount;
    		System.out.println("Deposited amount is " + amount + " and available balance is " + balance);
    	}
    	else {
    		System.out.println("Error");
    	}
    	
    }
    public double balancecheck() {
    	return balance;   	
    	
    }
	public static void main(String[] args) {
		Account check1=new Account();
		Account check2=new Account("Ragu", 1001);
		check1.withdraw(10.0);
		check1.deposit(1000.0);
		System.out.println("Updated Balance is " + check1.balancecheck());
		}
}
