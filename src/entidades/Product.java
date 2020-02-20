package entidades;

public class Product {

	private String nome;
	Double price;

	public Product() {
	}

	public Product(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public Double getPrice() {
		return price;
	}

}
