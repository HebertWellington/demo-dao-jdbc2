package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entities.Department;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("===Test 4: seller insert===");
		seller newSeller = new seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id "+newSeller.getId());
		
		System.out.println("===Test 5: seller update===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("update complete");

		System.out.println("===Test 6: seller delete===");
		System.out.println("insert id for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete complete");

	}

}
