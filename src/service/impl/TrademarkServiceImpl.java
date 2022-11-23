package service.impl;

import java.util.List;
import java.util.UUID;

import domain.Trademark;
import repository.TrademarkRepository;
import service.TrademarkService;

public class TrademarkServiceImpl implements TrademarkService {
	private TrademarkRepository trademarkRepository;
	public TrademarkServiceImpl() {
		trademarkRepository=new TrademarkRepository();
	}
	@Override
	public List<Trademark> findAll() {
		return trademarkRepository.findAll();
	}
	@Override
	public List<Trademark> findAll(int first, int size) {
		return trademarkRepository.findAll(first, size);
	}
	@Override
	public Trademark findByID(UUID key) {
		return trademarkRepository.findByID(key);
	}
	@Override
	public void insert(Trademark entity) throws Exception {
		trademarkRepository.insert(entity);
	}
	@Override
	public void update(Trademark entity) throws Exception {
		trademarkRepository.update(entity);
	}
	@Override
	public void remove(UUID key) throws Exception {
		trademarkRepository.remove(key);
	}
	@Override
	public Long count() {
		return trademarkRepository.count();
	}
	
}