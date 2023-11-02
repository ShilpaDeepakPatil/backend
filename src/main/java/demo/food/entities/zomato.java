package demo.food.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class zomato 
{
	@Id
private long id;
private long price;
private String name;
private long star;


public zomato() {
	super();
	
}
public zomato(long id, long price, String name, long star) {
	super();
	this.id = id;
	this.price = price;
	this.name = name;
	this.star = star;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getStar() {
	return star;
}
public void setStar(long star) {
	this.star = star;
}

@Override
public String toString() {
	return "food [id=" + id + ", price=" + price + ", name=" + name + ", star=" + star + "]";
}

}

