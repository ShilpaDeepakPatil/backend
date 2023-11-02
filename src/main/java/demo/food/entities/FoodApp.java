package demo.food.entities;

import jakarta.persistence.Id;

public class FoodApp {

	@Id
private long id;
private long price;
private String name;
private long star;
private long cookTime;
private String origins;
private String imageUrl;
private String tags;
public FoodApp() {
	super();
	// TODO Auto-generated constructor stub
}
public FoodApp(long id, long price, String name, long star, long cookTime, String origins, String imageUrl,
		String tags) {
	super();
	this.id = id;
	this.price = price;
	this.name = name;
	this.star = star;
	this.cookTime = cookTime;
	this.origins = origins;
	this.imageUrl = imageUrl;
	this.tags = tags;
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
public long getCookTime() {
	return cookTime;
}
public void setCookTime(long cookTime) {
	this.cookTime = cookTime;
}
public String getOrigins() {
	return origins;
}
public void setOrigins(String origins) {
	this.origins = origins;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public String getTags() {
	return tags;
}
public void setTags(String tags) {
	this.tags = tags;
}
@Override
public String toString() {
	return "FoodApp [id=" + id + ", price=" + price + ", name=" + name + ", star=" + star + ", cookTime=" + cookTime
			+ ", origins=" + origins + ", imageUrl=" + imageUrl + ", tags=" + tags + "]";
}

}
