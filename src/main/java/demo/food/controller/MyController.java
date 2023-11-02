package demo.food.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.food.Dao.zomatoDao;
import demo.food.entities.Cart;

import demo.food.service.foodService;

@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController

public class MyController 
{
	@Autowired
	private foodService fservice;
	@Autowired
	private zomatoDao zdao; 
	
	Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/home")
	public String home()
	{
		return "this is my postman page";
	}
	
	//adding the values
	@PostMapping("/carts")
	public Cart addCart(@RequestBody Cart c) {
		logger.info("recived add cart item" +c);
		c.setQuantity(1);
		c.setTotalprice(c.getPrice());
		return this.fservice.addCart(c);
	}


	// get the all cart
		@GetMapping("/carts")
		public List<Cart> getCart()
		{
			return this.fservice.getCart();
		}
				
		//update the cart
		@PutMapping("/carts/{id}")
		public ResponseEntity<Cart> updateCart(@PathVariable int id,@RequestBody Cart updateCart){
			Cart c=fservice.findById(id);
			if(c==null) {
				return ResponseEntity.notFound().build();
		 }
		       c.setQuantity(updateCart.getQuantity());
		       //c.setPrice(c.getPrice()*c.getQuantity());
		       c.setTotalprice(updateCart.getPrice()*updateCart.getQuantity());
		      System.out.println("hello");
		       Cart savedCart=fservice.updateCart(c);
		       return ResponseEntity.ok(savedCart);
		}
		
		@DeleteMapping("/carts/{id}")
		public ResponseEntity<HttpStatus> deleteCart(@PathVariable String id)
		{
			try {
			this.fservice.deleteCart(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
		
//		@PutMapping("/carts")
//		public ResponseEntity<Cart>updateCart(@PathVariable Long quantity,@RequestBody Cart updateCart) 
//		{
//			logger.info("recived update cart item" +quantity);
//			return this.fservice.updateCart(quantity);
//	}
		
	
//		//get the single cartid
//		@GetMapping("/carts/{id}")
//		
//		public Cart getCart(@PathVariable String id) 
//		{
//			return this.fservice.getCart(Long.parseLong(id));
//		}
			
//		//get the single cartname
//		@GetMapping("carts/name/{name}")  
//		public List<Cart> findByName(@PathVariable String name) 
//		{
//			return this.fservice.findByName(name);
//		}
				
		//get the single cartname
				/*@PutMapping("cart")  
				public List<Cart> findByQuantity(@PathVariable long quantity) 
				{
					return this.fservice.findByQunatity(quantity);
				}*/
		
		
		
		

