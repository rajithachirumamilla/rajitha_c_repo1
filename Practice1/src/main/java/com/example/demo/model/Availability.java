package com.example.demo.model;

	public class Availability {
		private String storeNo ;
		private String productId;
		private java.util.Date launchDate;
		private Double availQty;
		public String getStoreNo() {
			return storeNo;
		}
		public void setStoreNo(String storeNo) {
			this.storeNo = storeNo;
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public java.util.Date getLaunchDate() {
			return launchDate;
		}
		public void setLaunchDate(java.util.Date launchDate) {
			this.launchDate = launchDate;
		}
		public Double getAvailQty() {
			return availQty;
		}
		public void setAvailQty(Double availQty) {
			this.availQty = availQty;
		}
		

}
