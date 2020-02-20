package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entidades.enumeracao.OrderStatus;

public class Order {
	private LocalDateTime data_hora = LocalDateTime.now();
	private OrderStatus status;
	
	List <OrderItem> listaItem = new ArrayList<>();
	Client client = new Client();
	

	public Order() {
	}

	public Order(LocalDateTime data_hora, OrderStatus status) {
		this.data_hora = data_hora;
		this.status = status;
	}

	public LocalDateTime getData_hora() {
		return data_hora;
	}

	public OrderStatus getStatus() {
		return status;
	}

}
