package repository;

import java.util.UUID;

import domain.Trademark;
import utils.JpaRespository;



public class TrademarkRepository extends JpaRespository<Trademark, UUID>{

	public TrademarkRepository() {
		super(Trademark.class);
	}
	
}