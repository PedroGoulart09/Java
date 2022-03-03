package Heranca;

public class Heranca {
	public static void main(String[] args) {
		Account acc = new Account(1002, "jao", 500.0);
		Account acc20 = new SavingsAccount(1001, "pedro", 1000.0, 200.0);
		acc20.withdraw(300.0);
		System.out.println(acc20);
		acc.deposit(200.00);
		System.out.println(acc.getBalance());
		BusinessAccount bacc = new BusinessAccount(1001, "pedro", 1000.0, 200.0);

		bacc.withdraw(200.0);
		System.out.println(bacc.getBalance());

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1001, "jao", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1001, "alfredo", 0.0, 200.0);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(100.00);
			System.out.println("loan");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.getBalance();
			System.out.println("update");
		}

	}
}
