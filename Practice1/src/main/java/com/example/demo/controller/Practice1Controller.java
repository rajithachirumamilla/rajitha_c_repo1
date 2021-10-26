package com.example.demo.controller;



import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AvailabilitySD;
import com.example.demo.model.Product;
import com.example.demo.model.ProductList;
import com.example.demo.model.Supply;
import com.example.demo.services.Practice1Service;

@RestController

public class Practice1Controller {

	@Autowired
	Practice1Service service1;
	
	@PostMapping(path="/sortProducts", produces = "application/json")
	public List<Product> sortProductspath(@RequestBody ProductList productlist ){
		List<Product> sortedList = productlist.sortinglist();
		return sortedList;
		
	}
	@PostMapping(path="/getAvailability", produces = "application/json")
	public AvailabilitySD getAvailabilityController(@RequestBody Supply product ) throws Exception{
		AvailabilitySD availabilitySD = service1.getAvailability(product);
		return availabilitySD;
		
	}
}
