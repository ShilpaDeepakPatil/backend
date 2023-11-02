package demo.food.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.food.entities.Cart;

public interface zomatoDao extends JpaRepository<Cart,Long> 
{	
public	List<Cart> findByName(String name);

public Optional<Cart> findByQuantity(Long quantity);

public void save(Long quantity);

public Optional<Cart> findById(int id);




}
