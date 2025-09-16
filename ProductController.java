package com.dpcart.dp_Store.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpcart.dp_Store.models.Product;
import com.dpcart.dp_Store.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping()
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	@GetMapping("/products/detials")
	public List<Map<String,Object>> getAllProductDetial()
	{
		return Arrays.asList(
				Map.of("name","Product 1", "Price ",1099),
				Map.of("name","Product 2", "Price ",1099)
				);
	}
	

}
