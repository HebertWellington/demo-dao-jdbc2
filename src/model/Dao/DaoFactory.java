package model.Dao;

import db.DB;
import model.Dao.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao CreateSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
