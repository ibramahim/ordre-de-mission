package DataBase;

import java.sql.ResultSet;
import java.sql.Statement;

public class Emplyer extends DataBaseClass {
	protected int id;
	public String nom;
	public String prenom;
	public String fonction;

	public Emplyer(int id, String nom, String prenom, String fonction) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
	}
	
	public Emplyer(int id){
		this.id = id;
	}
	public static String getCreateTableQuery() {
		return "CREATE TABLE Employe (" + "id INTEGER PRIMARY KEY AUTOINCREMENT ," + "nom TEXT," + "prenom TEXT,"
				+ "fonction TEXT" + ");";
	}

	public void ajouter() {
		String requetC = "INSERT INTO Employe (nom,prenom,fonction) VALUES ('" + nom + "','" + prenom + "','"
				+ fonction + "')";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetC);
			ResultSet i = statment.executeQuery("SELECT last_insert_rowid();");
			while(i.next())
				id = i.getInt(1);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifier() {
		String requetC = "UPDATE Employe SET nom = '" + nom + "',prenom = '" + prenom + "',fonction = '" + fonction
				+ "' " + "WHERE id = " + id;
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetC);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		String requetC = "DELETE FROM Employe WHERE id = " + id + ";";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetC);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String toString(){
		return id +" , "+nom+" , "+prenom+" , "+fonction;
	}
}
