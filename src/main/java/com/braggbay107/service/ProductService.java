package com.braggbay107.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay107.domain.Product;
import com.braggbay107.dto.ProductDTO;
import com.braggbay107.dto.ProductSearchDTO;
import com.braggbay107.dto.ProductPageDTO;
import com.braggbay107.dto.ProductConvertCriteriaDTO;
import com.braggbay107.service.GenericService;
import com.braggbay107.dto.common.RequestDTO;
import com.braggbay107.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ProductService extends GenericService<Product, Integer> {

	List<Product> findAll();

	ResultDTO addProduct(ProductDTO productDTO, RequestDTO requestDTO);

	ResultDTO updateProduct(ProductDTO productDTO, RequestDTO requestDTO);

    Page<Product> getAllProducts(Pageable pageable);

    Page<Product> getAllProducts(Specification<Product> spec, Pageable pageable);

	ResponseEntity<ProductPageDTO> getProducts(ProductSearchDTO productSearchDTO);
	
	List<ProductDTO> convertProductsToProductDTOs(List<Product> products, ProductConvertCriteriaDTO convertCriteria);

	ProductDTO getProductDTOById(Integer productId);







}





