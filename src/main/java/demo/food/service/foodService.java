package demo.food.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import demo.food.entities.Cart;


public interface foodService {

public Cart addCart(Cart c);

public List<Cart> getCart();

public Cart getCart(long parseLong);

public List<Cart> findByName(String name);

public void deleteCart(long parseLong);

public Cart findById(int id);

public Cart updateCart(Cart c);


	
}
