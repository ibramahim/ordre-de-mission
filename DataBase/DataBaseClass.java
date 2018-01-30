package DataBase;

import java.sql.*;

import java.util.ArrayList;

import com.sun.xml.internal.ws.server.DraconianValidationErrorHandler;

public class DataBaseClass {
	/* ajouter les methodes n�cissaite pour la connexion au base de donn�e et 
	 * la creation des tableau si'il n'existe pas
	 *
	 */
	
	
	static Connection connection;
	static 	Statement statment;
	static 	ResultSet result;
	
	
	public static Connection Conneter() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection cnx = DriverManager.getConnection("jdbc:sqlite:/home/ibramahim/github/ordre-de-mission/DataBase/data.db");
			return cnx;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Employe> getAllStudiants(){

	
	
	public ResultSet Recherch_Employer() {

		try {
			connection = Conneter();
			statment = connection.createStatement();
			result = statment.executeQuery("SELECT * FROM employer");
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		
	}
	

	public ResultSet Recherch_Mission(int x) {

		try {
			connection = Conneter();
			statment = connection.createStatement();
			result = statment.executeQuery("SELECT * FROM mission WHERE id =" + x);
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		
	}
	

	public ResultSet Recherch_Congee(int x) {
		
		try {
			connection = Conneter();
			statment = connection.createStatement();
			result = statment.executeQuery("SELECT * FROM congee WHERE id =" + x);
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		
		
	}

	
	
	public static void Ajouter_Mission(Date Ddebut, Date Dfin, String lieux, String projet) {

		try {

			String requet = "INSERT INTO mission VALUES (" + Ddebut + "," + Dfin + ",'" + lieux + "','" + projet + "')" ;
			
			connection = Conneter();
			statment = connection.createStatement();
			statment.executeUpdate(requet);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}
	
	
	
	public static void Ajouter_Congee(Date Ddebut, Date Dfin) {

		try {

			String requet = "INSERT INTO congee VALUES (" + Ddebut + "," + Dfin + ")" ;
			
			connection = Conneter();
			statment = connection.createStatement();
			statment.executeUpdate(requet);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}
	
	
	public static void Ajouter_Employer(String nom, String prenom, String fonction) {

		try {

			String requet = "INSERT INTO employer (nom,prenom,fonction) VALUES ('" + nom + "','" + prenom + "','" + fonction + "')" ;
			
			connection = Conneter();
			statment = connection.createStatement();
			statment.executeUpdate(requet);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}

	

	
	public static void Modifier_Employer(int id, String nom, String prenom, String fonction) {

		try {

			String requet = "UPDATE  employer SET nom = '" + nom + "' ,prenom = '" + prenom + "' ,fonction = '" + fonction + "' WHERE id =" + id ;
			
			connection = Conneter();
			statment = connection.createStatement();
			statment.executeUpdate(requet);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}

	
	public static void Modifier_Congee(int id, Date Ddebut, Date Dfin) {

		try {

			String requet = "UPDATE  congee SET Ddebut = '" + Ddebut + "' ,Dfin = '" + Dfin +  "' WHERE id =" + id ;
			
			connection = Conneter();
			statment = connection.createStatement();
			statment.executeUpdate(requet);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}

	
	public static void Modifier_Mission(int id, Date Ddebut, Date Dfin, String lieu, String projet) {

		try {

			String requet = "UPDATE  employer SET Ddebut = '" + Ddebut + "' ,Dfin = '" + Dfin +  "' ,lieu = '" + lieu + "' ,projet = '" + projet + "' WHERE id =" + id ;
			
			connection = Conneter();
			statment = connection.createStatement();
			statment.executeUpdate(requet);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}

	
	
	
	
	
	public ArrayList<Etudiant> getAllStudiants(){
>>>>>>> ff21316d6989bfffcfebcdbdd59d709c85d305c6
		return null;
	}
	public ArrayList<Employe> getStudNearToDate(int nombreDesJours){
		return null;
	}

	public static void main(String[] args) {


		
	}



}
