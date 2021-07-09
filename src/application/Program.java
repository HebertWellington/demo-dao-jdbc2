package application;

import java.util.Date;

import model.entities.Department;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		System.out.println(obj);
		
		seller seller = new seller(21, "Bob", "bob@gmail", new Date(), 3000.00, obj);
		System.out.println(seller);
	}

}
