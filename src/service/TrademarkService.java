package service;

import java.util.List;
import java.util.UUID;

import domain.Trademark;

public interface TrademarkService {

	Long count();

	void remove(UUID key) throws Exception;

	void update(Trademark entity) throws Exception;

	void insert(Trademark entity) throws Exception;

	Trademark findByID(UUID key);

	List<Trademark> findAll(int first, int size);

	List<Trademark> findAll();
	
}