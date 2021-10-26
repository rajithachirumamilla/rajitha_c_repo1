package com.example.demo.model;

public class Product {
	private String productId;
	private String productName;
	private String unitOfMeasure;
	private java.util.Date launchDate;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", unitOfMeasure=" + unitOfMeasure
				+ ", launchDate=" + launchDate + "]";
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public java.util.Date getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(java.util.Date launchDate) {
		this.launchDate = launchDate;
	}
	
	
}
