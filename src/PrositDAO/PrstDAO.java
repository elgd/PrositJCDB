package PrositDAO;
import java.sql.*;
import java.util.*;

	public class PrstDAO{
		
		private Connection MaConnection ;
		private Statement transmission;
		private ResultSet resultat;
		//List idPage;
		
		public PrstDAO(){
			try {
				MaConnection = DriverManager.getConnection("jdbc:mysql://localhost/statistiquesdb","root","");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("erreur dans l'obtention de la connexion --le prog va s'arrêter");
					}
						}
		public void listidPage() throws SQLException{

				transmission = MaConnection.createStatement();
				resultat = transmission.executeQuery("SELECT date, COUNT(idPage)FROM consulte GROUP BY ( date )");
				//resultat = transmission.executeQuery("SELECT * FROM consulte");
				while(resultat.next()){
					   java.sql.Date date = resultat.getDate("date");
					   int NbreVisite = resultat.getInt("COUNT(idPage)"); 
					   System.out.println("Nombre de page visité le " +date + " : " + NbreVisite);					   
				}
				}
		
		public void listidVisiteur() throws SQLException{

			transmission = MaConnection.createStatement();
			resultat = transmission.executeQuery("SELECT date, COUNT(adresseIP)FROM consulte GROUP BY ( date )");
			//resultat = transmission.executeQuery("SELECT * FROM consulte");
			while(resultat.next()){
				   java.sql.Date date = resultat.getDate("date");
				   int NbreVisite = resultat.getInt("COUNT(adresseIP)"); 
				   System.out.println("Nombre de Visiteur le " + date + " : " + NbreVisite);					   
			}
			}
	
		public void listtaille() throws SQLException{

			transmission = MaConnection.createStatement();
			resultat = transmission.executeQuery("SELECT date, COUNT(taille) FROM `composeede`  INNER JOIN `fichier` INNER JOIN `consulte` WHERE `composeede`.`idPage` = `consulte`.`idPage` AND  `composeede`.`idFichier` =  `fichier`.`idFichier` GROUP BY ( date )");
			//resultat = transmission.executeQuery("SELECT * FROM consulte");
			while(resultat.next()){
				   java.sql.Date date = resultat.getDate("date");
				   int NbreVisite = resultat.getInt("COUNT(taille)"); 	
				int mois =  date.getMonth();
				   System.out.println("Taille des fichier telechargé le " + date + " : " + NbreVisite+ " : " + mois);					   
			}
			}
		
}

	