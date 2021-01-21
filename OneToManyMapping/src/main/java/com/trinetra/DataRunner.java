package com.trinetra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.trinetra.entity.Model;
import com.trinetra.entity.Product;
import com.trinetra.repository.ProductRepository;

@Component
public class DataRunner implements CommandLineRunner{

	@Autowired
	ProductRepository prodRepo;
	
	@Override
	public void run(String... args) throws Exception {

		List<Model> al = new ArrayList<>();
		
		Model m1 = new Model(10,"SN002","RED");
		Model m2 = new Model(11,"SN006","BLUE");
		
		al.add(m1);
		al.add(m2);
		
//		List<Model> asList = Arrays.asList(m1,m2);
		
		Product p = new Product(50,"Laptop",30000.0,al);
		
//		Product p1 = new Product(50,"Laptop",30000.0,Arrays.asList(m1,m2));
		
		prodRepo.save(p);
		
		
		
		
	}

	
}
