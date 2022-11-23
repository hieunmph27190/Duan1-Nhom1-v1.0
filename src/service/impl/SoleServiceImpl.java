package service.impl;

import java.util.List;
import java.util.UUID;

import domain.Sole;
import repository.SoleRepository;
import service.SoleService;

public class SoleServiceImpl implements SoleService{
	private SoleRepository soleRepository;
	public SoleServiceImpl() {
		soleRepository=new SoleRepository();
	}
	@Override
	public List<Sole> findAll() {
		return soleRepository.findAll();
	}
	@Override
	public List<Sole> findAll(int first, int size) {
		return soleRepository.findAll(first, size);
	}
	@Override
	public Sole findByID(UUID key) {
		return soleRepository.findByID(key);
	}
	@Override
	public void insert(Sole entity) throws Exception {
		soleRepository.insert(entity);
	}
	@Override
	public void update(Sole entity) throws Exception {
		soleRepository.update(entity);
	}
	@Override
	public void remove(UUID key) throws Exception {
		soleRepository.remove(key);
	}
	@Override
	public Long count() {
		return soleRepository.count();
	}
	
}