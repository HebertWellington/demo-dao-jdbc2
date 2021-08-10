package application;

import java.util.List;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entities.Department;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		System.out.println("===Test 1: seller findById===");
		seller seller = sellerDao.findById(4);
		System.out.println(seller);
		
		System.out.println("===Test 2: seller findByDpartmentId===");
		Department department = new Department(2, null);
		List<seller> list = sellerDao.findByDepartment(department);
		for(seller obj : list) {
		System.out.println(obj);
		}
			
		System.out.println("===Test 3: seller findAll===");
		list = sellerDao.findAll();
		for(seller obj : list) {
		System.out.println(obj);	
		}


	}

}
