package repository;

import java.util.UUID;

import domain.Product;
import utils.JpaRespository;



public class ProductRepository extends JpaRespository<Product, UUID>{

	public ProductRepository() {
		super(Product.class);
	}
	
}