package com.braggbay107.dao;

import java.util.List;

import com.braggbay107.dao.GenericDAO;
import com.braggbay107.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


