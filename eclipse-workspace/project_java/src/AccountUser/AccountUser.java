package AccountUser;
import java.util.Locale;
import java.util.Scanner;

public class AccountUser {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		UsersControl userControl;
		
		System.out.println("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String nameUser = sc.nextLine();
		System.out.println("Is there na initial deposit value (y/n)");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter a intial deposit value: ");
			double initialDeposit = sc.nextDouble();
			userControl = new UsersControl(numberAccount, nameUser, initialDeposit);
		} else {
			userControl = new UsersControl(numberAccount, nameUser);
		}

		System.out.println("Account data: ");
		System.out.println("Update account data: ");
		System.out.println(userControl);

		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		userControl.addDeposit(depositValue);
		System.out.println(userControl);

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		userControl.removeDeposit(withdrawValue);
		System.out.println("Update account: ");
		System.out.println(userControl);

		sc.close();

	}
}
