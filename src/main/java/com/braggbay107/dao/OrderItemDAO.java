package com.braggbay107.dao;

import java.util.List;

import com.braggbay107.dao.GenericDAO;
import com.braggbay107.domain.OrderItem;





public interface OrderItemDAO extends GenericDAO<OrderItem, Integer> {
  
	List<OrderItem> findAll();
	






}


