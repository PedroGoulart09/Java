import java.util.Locale;

public class Main {
	

	public static void main(String[] args) {
		String name = "Pedro";
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 20;
		int age2 = 30;
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		double x = 10.25465;
		double money = 4000.00;
		
		System.out.printf("Products:%n %s, which price is R$ %.2f%n %s, which price is R$ %.2f%n", product1, price1, product2, price2);
		System.out.printf("%s tem %d de idade e seu salario é R$ %.2f por mes%n", name, age, money);
		System.out.printf("%.2f%n", x);
		System.out.println(" O resultado é " + x + " metros ");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.printf("Resultado = %.2f metros%n", x);

	}

}
