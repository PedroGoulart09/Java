package FuncoesParaString;

public class FuncoesParaString {
	public static void main(String[] args) {
		String teste = "ABC bba DDD ccdFD  ";

		String s1 = teste.trim();
		String s2 = teste.substring(2);
		String s3 = teste.substring(2, 9);
		String s4 = teste.replace("ABC", "x");
		int s5 = teste.indexOf("DDD");
		int s6 = teste.lastIndexOf("FD");
		String names = "potato pedro joao orange";
		String[] vect = names.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println("trim -" + s1 + "-");
		System.out.println("substring -" + s2 + "-");
		System.out.println("substring -" + s3 + "-");
		System.out.println("replace -" + s4 + "-");
		System.out.println("indexOf -" + s5 + "-");
		System.out.println("lastIndexOf -" + s6 + "-");

	}
}
