package application;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		System.out.println("===Test 1: seller findById===");
		seller seller = sellerDao.findById(4);
		System.out.println(seller);
	}

}
