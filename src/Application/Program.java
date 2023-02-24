package Application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	    
		Departament obj = new Departament(1 , "books");
				System.out.println(obj);
		
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");		
				
		Seller sel = new Seller(1, "kenedy", "kndgfls5@gmail.com", new Date(), 3000.0, obj);		
		System.out.println(sel);
	}

}
