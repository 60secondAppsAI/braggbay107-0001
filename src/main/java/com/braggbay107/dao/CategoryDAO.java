package com.braggbay107.dao;

import java.util.List;

import com.braggbay107.dao.GenericDAO;
import com.braggbay107.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


