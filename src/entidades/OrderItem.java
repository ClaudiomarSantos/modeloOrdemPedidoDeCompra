package entidades;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	Product product = new Product();

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Double subTotal() {
		return quantity * price;

	}
}
