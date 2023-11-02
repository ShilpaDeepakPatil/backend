package demo.food.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import demo.food.Dao.zomatoDao;
import demo.food.entities.Cart;

@Service
public class foodServiceImpl implements foodService
{
 @Autowired
	private zomatoDao zdao;

@Override
public Cart addCart(Cart c) {
	zdao.save(c);
	return c;
}

@Override
public List<Cart> getCart() {
	// TODO Auto-generated method stub
	return zdao.findAll();
}

@Override
public Cart getCart(long id) {
	return zdao.findById(id).get();
}

@Override
public List<Cart> findByName(String name) {
	List<Cart> c1= zdao.findByName(name);
	c1.forEach(e->System.out.println(e));
	return c1;
}

@Override
public void deleteCart(long parseLong) {
	Cart entity = zdao.getOne(parseLong);
	zdao.delete(entity);	
}

@Override
public Cart findById(int id) {	
		return zdao.findById(id).orElse(null);
	}


@Override
public Cart updateCart(Cart c) {
	zdao.save(c);
	return c;
}



}


