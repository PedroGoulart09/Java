package EnumeracoesEcomposicao;

import java.util.Date;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;

	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Aux2Enumeracoes [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

}
