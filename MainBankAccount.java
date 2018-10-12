
public class MainBankAccount {

	public static void main(String[] args) {
		BankAccount sbAccount= new BankAccount(254631,"Nesha",63521);
		sbAccount.showBalance();
		sbAccount.withdraw(3521);
		sbAccount.showBalance();
		sbAccount.deposit(40000);
		sbAccount.showBalance();
		
	}

}
