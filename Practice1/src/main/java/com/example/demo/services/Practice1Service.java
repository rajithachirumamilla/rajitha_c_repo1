package com.example.demo.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.AvailabilitySD;
import com.example.demo.model.Demand;
import com.example.demo.model.Supply;

@Service
public class Practice1Service {
	
	List<Supply> supplyProducts = Arrays.asList(
            new Supply("Product1",(double) 10),
            new Supply("Product2",(double) 5)
    );
	List<Demand> demandProducts = Arrays.asList(
            new Demand("Product1",(double) 2),
            new Demand("Product2",(double) 5)
    );
	
	public AvailabilitySD getAvailability(Supply product) {
		String productInput=product.getProductId();
		List<Supply> supplyProductList=supplyProducts.stream().filter(p->p.getProductId().equals(productInput)).collect(Collectors.toList());
		Double availiabilty=0.0;
		for(Supply obj : supplyProductList){
			availiabilty=availiabilty+obj.getQuantity();
			System.out.println(availiabilty);
		}
		List<Demand> demandProductList=demandProducts.stream().filter(p->p.getProductId().equals(productInput)).collect(Collectors.toList());
		Double demandQty=0.0;
		for(Demand obj : demandProductList){
			availiabilty-=obj.getQuantity();
		}
		return new AvailabilitySD(productInput,availiabilty);
	}
}
