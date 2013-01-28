package Client;
import java.sql.*;


import PrositDAO.*;

public class Test {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		PrstDAO prst = new PrstDAO();
		prst.listidPage();
		prst.listidVisiteur();
		prst.listtaille();
		System.out.println("Salut abrutis!");
		System.out.println("tralalala");
		// TODO Auto-generated method stub

	}

}
