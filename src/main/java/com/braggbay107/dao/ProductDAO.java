package com.braggbay107.dao;

import java.util.List;

import com.braggbay107.dao.GenericDAO;
import com.braggbay107.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


