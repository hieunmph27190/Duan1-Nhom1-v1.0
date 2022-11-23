package service.impl;

import java.util.List;
import java.util.UUID;

import domain.Promotion;
import repository.PromotionRepository;
import service.PromotionService;

public class PromotionServiceImpl implements PromotionService {
	private PromotionRepository promotionRepository;
	public PromotionServiceImpl() {
		promotionRepository=new PromotionRepository();
	}
	@Override
	public List<Promotion> findAll() {
		return promotionRepository.findAll();
	}
	@Override
	public List<Promotion> findAll(int first, int size) {
		return promotionRepository.findAll(first, size);
	}
	@Override
	public Promotion findByID(UUID key) {
		return promotionRepository.findByID(key);
	}
	@Override
	public void insert(Promotion entity) throws Exception {
		promotionRepository.insert(entity);
	}
	@Override
	public void update(Promotion entity) throws Exception {
		promotionRepository.update(entity);
	}
	@Override
	public void remove(UUID key) throws Exception {
		promotionRepository.remove(key);
	}
	@Override
	public Long count() {
		return promotionRepository.count();
	}
	
}