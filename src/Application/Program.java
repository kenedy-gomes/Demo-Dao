package Application;
import model.Dao.DaoFactore;
import model.Dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
			
		SellerDao sellerdao = DaoFactore.createSellerDao();	
		
		Seller seller = sellerdao.fingById(3);
		
		System.out.println(seller);
		
		 	
	}

}
