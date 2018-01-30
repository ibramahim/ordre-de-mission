package DataBase;

import java.sql.*;

import java.util.ArrayList;

import com.sun.xml.internal.ws.server.DraconianValidationErrorHandler;

public class DataBaseClass {
	/*
	 * ajouter les methodes n�cissaite pour la connexion au base de donn�e
	 * et la creation des tableau si'il n'existe pas
	 *
	 */

	static Connection connection;

	public DataBaseClass() {

		boolean existe = new File("data.db").exists();
	}try

	{
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:data.db");
		if (!existe) {
		statment = connection.createStatement();
		
		}
		return cnx;

	}catch(
	Exception e)
	{
		e.printStackTrace();
		return null;
	}
	}<<<<<<<HEAD

	public ArrayList<Employe> getAllStudiants(){

	
=======
<<<<<<< HEAD
>>>>>>> cc4ba65613505392e3c732784acf1ecafc8bbc58

	public ResultSet Recherch_ID(String table, int id) {
		
		try {
			connection = Conneter();
			statment = connection.createStatement();
			result = statment.executeQuery("SELECT * FROM " + table + " WHERE id =" + id);
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}

	public static void Ajouter(String table, mission m) {

		try {

			String requetM = "INSERT INTO mission VALUES ( '" + m.Ddebut + "' ,'" + m.Dfin + "','" + m.lieux + "','" + m.projet + "')" ;
			String requetC = "INSERT INTO congee VALUES (" + Ddebut + "," + Dfin + ")" ;
			String requetE = "INSERT INTO employer (nom,prenom,fonction) VALUES ('" + lieu + "','" + projet + "','" + fonction + "')" ;

			connection = Conneter();
			statment = connection.createStatement();

			if(table == "mission") {
				statment.executeUpdate(requetM);
			}else if(table == "congee") {
						statment.executeUpdate(requetC);
				  }else {
					  	statment.executeUpdate(requetE);
				  }
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}

	public static void Modifier(String table, Date Ddebut, Date Dfin, String lieux, String projet, String fonction, int id) {

		try {

			String requetE = "UPDATE  employer SET nom = '" + lieux + "' ,prenom = '" + projet + "' ,fonction = '" + fonction + "' WHERE id =" + id ;
			String requetC = "UPDATE  congee SET Ddebut = '" + Ddebut + "' ,Dfin = '" + Dfin +  "' WHERE id =" + id ;
			String requetM = "UPDATE  mission SET Ddebut = '" + Ddebut + "' ,Dfin = '" + Dfin +  "' ,lieu = '" + lieux + "' ,projet = '" + projet + "' WHERE id =" + id ;
			
			connection = Conneter();
			statment = connection.createStatement();

			if(table == "mission") {
				statment.executeUpdate(requetM);
			}else if(table == "congee") {
						statment.executeUpdate(requetC);
				  }else {
					  	statment.executeUpdate(requetE);
				  }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		
	}

	public ArrayList<Etudiant> getAllStudiants(){
<<<<<<< HEAD
>>>>>>> ff21316d6989bfffcfebcdbdd59d709c85d305c6
=======
=======

	public ArrayList<Employe> getAllStudiants(){
>>>>>>> b251dd99bf7dd857fdc967d17a6eaa7b99a77e4c
>>>>>>> cc4ba65613505392e3c732784acf1ecafc8bbc58
		return null;
	}

	public ArrayList<Employe> getStudNearToDate(int nombreDesJours) {
		return null;
	}

	public static void main(String[] args) {

	}

}
