package demo.food.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	private int id;
	private String name;
	private int quantity;
	private int price;
	private int totalprice;
	public Cart() 
	{
		super();
	}

	
	public Cart(int id, String name, int quantity, int price, int totalprice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.totalprice = totalprice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", totalprice="
				+ totalprice + "]";
	}


	
	
}
