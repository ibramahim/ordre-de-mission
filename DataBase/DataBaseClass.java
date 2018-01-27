package DataBase;

import java.sql.*;
import java.util.ArrayList;

import com.sun.xml.internal.ws.server.DraconianValidationErrorHandler;

public class DataBaseClass {
	/* ajouter les methodes n�cissaite pour la connexion au base de donn�e et 
	 * la creation des tableau si'il n'existe pas
	 *
	 */
	public static Connection conneter() {
		try {
			Class.forName("org.sqlite.jdbc.Driver");
			System.out.println("driver ok");
			
			String url = "";
			
			Connection cnx = DriverManager.getConnection("jdbc:sqlite:"+url);
			return cnx;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<Etudiant> getAllStudiants(){
		return null;
	}
	public ArrayList<Etudiant> getStudNearToDate(int nombreDesJours){
		return null;
	}
}
