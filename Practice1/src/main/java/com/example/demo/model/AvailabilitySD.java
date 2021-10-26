package com.example.demo.model;

public class AvailabilitySD {
	String productId;
	Double Availability;
	
	public AvailabilitySD(String productId, Double availability) {
		super();
		this.productId = productId;
		Availability = availability;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getAvailability() {
		return Availability;
	}
	public void setAvailability(Double availability) {
		Availability = availability;
	}
	
	
}
