package Assignment_1;

public class BankingApplication {
	public static void main(String[]args) {
		SavingsAccount sav1=new SavingsAccount(12345,90000.0,2.5);
		CurrentAccount cur1=new CurrentAccount(12345,90000.0,1100000.00);
		sav1.deposit();
		sav1.withdrawal();
		cur1.withdrawal();
		cur1.deposit();
	}

}
abstract class Account{
	public static int accountNumber;
	public static double Balance;
abstract public void deposit();
abstract public void withdrawal();
public Account(int a,double b){
	this.accountNumber=a;
	this.Balance=b;
}
}
class SavingsAccount extends Account{
	public double interestRate;
	public double interest;
	public void deposit() {
		interest=(Balance*interestRate)/100;
		System.out.println("Interest on current balance is: "+interest);
	}
	public void withdrawal() {
		Balance=Balance+interest;
		System.out.println("Balance with Interest Amount: "+Balance);
	}
	public SavingsAccount(int a,double b,double c) {
		super(accountNumber=a,Balance=b);
		this.interestRate=c;
	}
}
class CurrentAccount extends Account{
	public double overDraft;
	public void deposit() {}
	public void withdrawal() {
		System.out.println("OverDraft Limit is: "+overDraft);
		if(Balance>overDraft) {
			System.out.println("Balance have exceeded OverDraft Limit");
		}
		else {
			System.out.println("Balance is within OverDraft Limit");
		}
	}
	public CurrentAccount(int a,double b,double c) {
		super(accountNumber=a,Balance=b);
		this.overDraft=c;
	}
	
}
