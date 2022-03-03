package Array;

import java.util.Locale;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		AuxArray2[] vect = new AuxArray2[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new AuxArray2(name, price);
		}

		double sum = 0.00;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();

		}

		double res = sum / vect.length;

		System.out.printf("Media dos valores: %.2f%n", res);

		sc.close();
	}
}
