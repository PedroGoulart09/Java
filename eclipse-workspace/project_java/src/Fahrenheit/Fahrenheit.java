package Fahrenheit;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {

		Scanner faren = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		char letter = 's';

		while (letter != 'n') {
			System.out.print("Digite o valor em Celsios: ");
			double Celsius = faren.nextDouble();
			double valueFaren = 9.0 * Celsius / 5.0 + 32.0;
			System.out.printf("O valor em Fahrenheit é: %.2f%n", valueFaren);

			System.out.printf("Deseja continuar (s/n)", letter);
			letter = faren.next().charAt(0);
		}

		faren.close();

	}
}
