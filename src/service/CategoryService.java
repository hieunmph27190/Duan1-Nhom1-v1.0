package service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import domain.Category;

public interface CategoryService {

	Long count();

	void remove(UUID key) throws Exception;

	void update(Category entity) throws Exception;

	void insert(Category entity) throws Exception;

	Category findByID(UUID key);

	List<Category> findAll(int first, int size);

	List<Category> findAll();

}