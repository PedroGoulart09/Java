package EnumeracoesEcomposicao;

import java.util.Date;

public class EnumeracoesEcomposicao {

	public static void main(String[] args) {

		Order enu = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(enu);

		OrderStatus s1 = OrderStatus.DELIVERED;
		OrderStatus s2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(s1);
		System.out.println(s2);

	}
}
