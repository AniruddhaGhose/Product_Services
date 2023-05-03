package com.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.entity.Product;
import com.ps.entity.User;
import com.ps.exception.ResourceErrorDetails;
import com.ps.exception.ResourceNotFoundException;
import com.ps.service.ProductServices;

@Controller
public class ProductControler {

	@Autowired
	private ProductServices productServices;

	@RequestMapping(path = "/save-product", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "add-product";
		}
		productServices.addProduct(product);
		System.out.println("product is added");
		return "save-product";

	}

	@RequestMapping("/list")
	public String listProduct(Model model) {

		List<Product> products = productServices.getAll();
		model.addAttribute("products", products);

		return "products-list";
	}

	@RequestMapping("/update/{product_ID}")
	public String updateProduct(@PathVariable("product_ID") int product_ID, Model model)
			throws ResourceNotFoundException {
		Product product = productServices.updateProduct(product_ID);
		model.addAttribute("product", product);

		return "update-product";
	}

	@RequestMapping(path = "/update/save-product", method = RequestMethod.POST)
	public String editedProduct(@ModelAttribute Product product, Model model) {
		productServices.addProduct(product);

		return "edited-product";
	}

	@RequestMapping("search/{product_ID}")
	public String getproduct(@PathVariable("product_ID") int product_ID, Model model) {

		Product product = productServices.searchProduct(product_ID);
		model.addAttribute("product", product);
		return "product-info";
	}

	@RequestMapping("/delete/{product_ID}")
	public String deleteProduct(@PathVariable("product_ID") int product_ID) throws ResourceNotFoundException {
		productServices.deleteProduct(product_ID);

		return "products-list";
	}

	@ExceptionHandler
	public ResponseEntity<ResourceErrorDetails> handleException(ResourceNotFoundException ex) {
		ResourceErrorDetails error = new ResourceErrorDetails();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
