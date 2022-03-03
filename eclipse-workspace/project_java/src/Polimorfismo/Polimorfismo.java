package Polimorfismo;

import Heranca.Account;
import Heranca.SavingsAccount;

public class Polimorfismo {
	public static void main(String[] args) {

		// O POLIMORFISMO SIGNIFICA MUITAS FORMAS CHAMAR A MESMA OPERACAO DO MESMO TIPO
		// MAS TIVERAM COMPORTAMENTOS DIFERENTE AOS QUAIS OBJETOS ELAS APONTAM

		Account x = new Account(1020, "alex", 1000.0);
		Account y = new SavingsAccount(1020, "alex", 1000.0, 0.01);

		x.withdraw(200.0);
		y.withdraw(200.0);
		System.out.println(x);
		System.out.println(y);
	}

}
