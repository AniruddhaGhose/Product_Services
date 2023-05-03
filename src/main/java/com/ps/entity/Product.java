package com.ps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int product_ID;

	private String product_Name;

	private String product_Description;

	private long product_Price;

	public int getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getProduct_Description() {
		return product_Description;
	}

	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	public long getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(long product_Price) {
		this.product_Price = product_Price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_ID, String product_Name, String product_Description, long product_Price) {
		super();
		this.product_ID = product_ID;
		this.product_Name = product_Name;
		this.product_Description = product_Description;
		this.product_Price = product_Price;
	}

	@Override
	public String toString() {
		return "Product [product_ID=" + product_ID + ", product_Name=" + product_Name + ", product_Description="
				+ product_Description + ", product_Price=" + product_Price + "]";
	}
	
	

}
