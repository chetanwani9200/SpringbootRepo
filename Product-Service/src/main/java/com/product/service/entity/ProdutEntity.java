package com.product.service.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ProdutEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pId;
	private String name;
	private String productName;
	private double price;
	public ProdutEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProdutEntity(Integer pId, String name, String productName, double price) {
		super();
		this.pId = pId;
		this.name = name;
		this.productName = productName;
		this.price = price;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
