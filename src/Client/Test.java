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
		
		// TODO Auto-generated method stub

	}

}
