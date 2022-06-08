package interfacePractice;

interface BankingAccount{
	double accountBalance=100000;
	double withdrawAmount=1000001;
	double debit(double accountBalance, double withdrawAmount);
	void print();
	
	
}

public class Account implements BankingAccount
{

public static void main(String[] args) {
	Account Obj = new Account();
	System.out.println("Account Balance Is ..=>"+Obj.debit(accountBalance, withdrawAmount));
	Obj.print();
	
	
}

@Override
public void print() {
	// TODO Auto-generated method stub
	if(withdrawAmount>accountBalance) {
		System.out.println("Debit Amount Exceeded Account Balance ."); 
	}
	
}

@Override
public double debit(double accountBalance, double withdrawAmount) {
	// TODO Auto-generated method stub
	if(accountBalance>=withdrawAmount) 
		
		
		 accountBalance=accountBalance-withdrawAmount;
		
		
		return accountBalance;
	
}
}
