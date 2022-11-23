package service.impl;

import java.util.List;
import java.util.UUID;

import domain.ProductDetail;
import repository.ProductDetailRepository;
import service.ProductDetailService;

public class ProductDetailServiceImpl implements ProductDetailService{
	private ProductDetailRepository productDetailRepository;
	public ProductDetailServiceImpl() {
		productDetailRepository = new ProductDetailRepository();
	}
	@Override
	public List<ProductDetail> findAll() {
		return productDetailRepository.findAll();
	}
	@Override
	public List<ProductDetail> findAll(int first, int size) {
		return productDetailRepository.findAll(first, size);
	}
	@Override
	public ProductDetail findByID(UUID key) {
		return productDetailRepository.findByID(key);
	}
	@Override
	public void insert(ProductDetail entity) throws Exception {
		productDetailRepository.insert(entity);
	}
	@Override
	public void update(ProductDetail entity) throws Exception {
		productDetailRepository.update(entity);
	}
	@Override
	public void remove(UUID key) throws Exception {
		productDetailRepository.remove(key);
	}
	@Override
	public Long count() {
		return productDetailRepository.count();
	}
	
}