package com.appmeta.appmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appmeta.appmeta.entities.Sale;
import com.appmeta.appmeta.repositories.SaleRepository;

@Service 
public class SaleService {

	@Autowired
	private SaleRepository repository; 

	public List<Sale> findSales() {
		return repository.findAll();
	}

}