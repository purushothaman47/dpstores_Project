package com.dpcart.dp_Store;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dpcart.dp_Store.models.Product;
import com.dpcart.dp_Store.repository.ProductRepository;

@Component
public class DataCreater implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String ...args) throws Exception{
		//Check if empty
		if(productRepository.count()==0)
		{
			List<Product> products =Arrays.asList(
	                new Product("iPhone 15", 79999.0, "Latest Apple iPhone", 4.8, "Electronics", "Apple Store", 20, 10,Arrays.asList("https://picsum.photos/200/300")),
	                new Product("Samsung TV", 55000.0, "55 inch 4K Smart TV", 4.5, "Electronics", "Samsung", 15, 8,Arrays.asList("https://picsum.photos/200/300")),
	                new Product("Nike Shoes", 4999.0, "Comfortable running shoes", 4.3, "Fashion", "Nike", 50, 25,Arrays.asList("https://picsum.photos/200/300")),
	                new Product("MacBook Air M2", 110000.0, "Apple M2 laptop with Retina display", 4.9, "Electronics", "Apple Store", 10, 12,Arrays.asList("https://picsum.photos/200/300")),
	                new Product("Sony Headphones", 7999.0, "Noise cancelling wireless headphones", 4.6, "Electronics", "Sony", 40, 22,Arrays.asList("https://picsum.photos/200/300")),
	                new Product("Levi's Jeans", 2499.0, "Slim fit blue jeans", 4.5, "Fashion", "Levi’s", 70, 40,Arrays.asList("https://picsum.photos/200/300")),
	                new Product("Office Chair", 4999.0, "Ergonomic mesh office chair", 4.3, "Furniture", "Godrej", 25, 19,Arrays.asList("https://picsum.photos/200/300"))
	            );
			productRepository.saveAll(products);
			System.out.println(" Sample products inserted into database!");
					
		}
	}
	
}
