package model.Dao;

import db.DB;
import model.Dao.impel.SellerDaoJDBC;

public class DaoFactore {

	public static  SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
