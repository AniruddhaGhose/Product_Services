package com.ps.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ps.entity.Product;
import com.ps.exception.ResourceNotFoundException;
import com.ps.repository.ProductDao;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private ProductDao productDao;

	public List<Product> list = new ArrayList<Product>();

	@Override
	@Transactional
	public Product addProduct(Product product) {

		return productDao.save(product);
	}

	@Override
	@Transactional
	public Product updateProduct(int product_ID) throws ResourceNotFoundException {

		return productDao.findById(product_ID).orElseThrow(() -> new ResourceNotFoundException(product_ID));

	}

	@Override
	@Transactional
	public Product searchProduct(int product_ID) {
		List<Product> p = getAll();
		Product product = p.stream().filter(p1 -> p1.getProduct_ID() == product_ID).findAny().get();

		return product;
	}

	@Override
	@Transactional
	public void deleteProduct(int product_ID) throws ResourceNotFoundException {
		Product p = productDao.findById(product_ID).orElseThrow(() -> new ResourceNotFoundException(product_ID));
		productDao.delete(p);
	}

	@Override
	@Transactional
	public List<Product> getAll() {

		return productDao.findAll();
	}

}
