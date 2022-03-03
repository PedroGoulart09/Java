package AccountUser;

public class UsersControl {

	private int accountUser;
	private String nameUser;
	private double balance;

	public UsersControl(int accountUser, String nameUser, double initialDeposit) {
		this.accountUser = accountUser;
		this.nameUser = nameUser;
		addDeposit(initialDeposit);
	}

	public UsersControl(int accountUser, String nameUser) {
		this.accountUser = accountUser;
		this.nameUser = nameUser;
	}

	public int getAccountUser() {
		return accountUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public double getBalance() {
		return balance;
	}

	public void addDeposit(double deposit) {
		balance += deposit;
	}

	public void removeDeposit(double removeDeposit) {
		balance -= removeDeposit + 5.00;
	}

	public String toString() {
		return "Account: " + accountUser + ", " + String.format("%s", nameUser) + ", "
				+ String.format("%.2f R$ ", balance);
	}

}
