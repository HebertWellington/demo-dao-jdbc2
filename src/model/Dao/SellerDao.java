package model.Dao;

import java.util.List;

import model.entities.seller;

public interface SellerDao {
	
	void insert (seller obj);
	void update (seller obj);
	void deleteById (Integer Id);
	seller findById(Integer Id);
	List<seller> findAll();

}
