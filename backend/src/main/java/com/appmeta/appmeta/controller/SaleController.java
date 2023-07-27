package com.appmeta.appmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appmeta.appmeta.entities.Sale;
import com.appmeta.appmeta.services.SaleService;

@RestController 
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired 
	private SaleService service; 

	@GetMapping
	public List<Sale> findSales() {
		return service.findSales();
	}
}
