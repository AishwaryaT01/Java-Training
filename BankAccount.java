
public class BankAccount {
private int accountNumber;
private String accountHolder;
private float balance;
public BankAccount(int acntNo, String acntHldrName,int bal){
	accountNumber=acntNo;
	accountHolder=acntHldrName;
	balance=bal;
}
public void withdraw(float amount){
	if(balance>amount)
		balance=balance-amount;
}
public void deposit(float amount){
	balance=balance+amount;
}
public void showBalance(){
	System.out.println("Balance="+balance);
}
}
