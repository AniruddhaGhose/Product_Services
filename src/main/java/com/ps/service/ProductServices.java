package com.ps.service;

import java.util.List;

import com.ps.entity.Product;
import com.ps.exception.ResourceNotFoundException;

public interface ProductServices {
	
	public Product addProduct(Product product);
	
	public Product updateProduct(int product_ID) throws ResourceNotFoundException;
	
	public Product searchProduct(int product_ID);
	
	public void deleteProduct(int product_ID)throws ResourceNotFoundException;
	
	public List<Product> getAll();

}
