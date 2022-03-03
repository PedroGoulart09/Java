package Array;
import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("Numero de pessoas: ");

		int n = sc.nextInt();

		double[] people = new double[n];

		for (int i = 0; i < n; i++) {
			people[i] = sc.nextDouble();
		}
		
		double sum = 0.00;
		for (int i = 0; i < n; i++) {
			sum += people[i];
		}
		
		double media = sum / n;
		
		System.out.printf("Alutura media: %.2f%n ", media);

		

		sc.close();

	}

}
