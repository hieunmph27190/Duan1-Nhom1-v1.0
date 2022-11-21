package service;

import java.util.List;
import java.util.UUID;

import domain.ProductDetail;

public interface ProductDetailService {

	Long count();

	void remove(UUID key) throws Exception;

	void update(ProductDetail entity) throws Exception;

	void insert(ProductDetail entity) throws Exception;

	ProductDetail findByID(UUID key);

	List<ProductDetail> findAll(int first, int size);

	List<ProductDetail> findAll();
	
}