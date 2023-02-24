package model.Dao.impel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.Dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection conn;
	
	public  SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller obj) {
	}

	@Override
	public void update(Seller obj) {
	}

	@Override
	public void deleteById(Integer id) {
	}

	@Override
	public Seller fingById(Integer id) {
		 PreparedStatement st = null;
		 ResultSet rs = null;
		 
		 try {
			 st = conn.prepareStatement(
					 "select sell.Id, sell.Name, sell.Email, depar.Name, depar.Id"
					 + "from seller sell inner join department depar"
					 + "on sell.Id = depar.Id"
					 + "where seller.Id = ?"
					 );
			 
			 st.setInt(1, id);
			 rs = st.executeQuery();
			 if(rs.next()) {
				 Departament dep = new Departament();
				 dep.setId(rs.getInt("depar.Id"));
				 dep.setName(rs.getString("depar.Name"));
				 
				 Seller sell = new Seller();
				 sell.setId(rs.getInt("Id"));
				 sell.setName(rs.getString("Name"));
				 sell.setName(rs.getString("Email"));
				 sell.setDepartament(dep);
				 return sell;
			 }
			 return null;
		 }
		 catch(SQLException e) {
			 throw new DbException(e.getMessage());
		 }
		 finally {
			 DB.closeStatement(st);
			 DB.closeResultSet(rs);
		 }
	}

	@Override
	public List<Seller> findAll() {
		return null;
	}

	
}
