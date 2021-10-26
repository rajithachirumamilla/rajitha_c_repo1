package com.example.demo.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {
private List<Product> productList;

public List<Product> getProductList() {
	return productList;
}

public void setProductList(List<Product> productList) {
	this.productList = productList;
}

public List<Product> sortinglist() {
	Comparator<Product> compareById= Comparator.comparing(Product::getProductId).reversed();
	Comparator<Product> compareByDate = Comparator.comparing( Product::getLaunchDate).reversed();
	Comparator<Product> compareByFinalCondition = compareById.thenComparing(compareByDate);
	return this.productList.stream().sorted(compareByFinalCondition).collect(Collectors.toList());
}

}
