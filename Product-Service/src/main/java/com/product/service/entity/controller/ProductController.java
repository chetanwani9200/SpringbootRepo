package com.product.service.entity.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.entity.ProdutEntity;
import com.product.service.entity.repository.ProductRepository;
import com.product.service.entity.response.Response;
@RestController
@RequestMapping(path="/products")
public class ProductController {
	
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/add")
	public ResponseEntity<Response> addProduct(@RequestBody ProdutEntity product){
		try {
		productRepository.save(product);
		return new ResponseEntity<Response>(HttpStatus.OK);
		}
		catch(Exception e) {
			Response response = new Response(701,"product"+"not saved succesfully"+e.getMessage());
			
			return new ResponseEntity<Response>(response ,HttpStatus.OK);
		}
		
	}
	
	

}
