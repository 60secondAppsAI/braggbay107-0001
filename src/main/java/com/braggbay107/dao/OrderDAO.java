package com.braggbay107.dao;

import java.util.List;

import com.braggbay107.dao.GenericDAO;
import com.braggbay107.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


