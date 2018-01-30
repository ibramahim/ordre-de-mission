package DataBase;

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

	public static String getCreateTableQuery() {
		return "CREATE TABLE Employe (" + "id INTEGER PRIMARY KEY AUTOINCREMENT ," + "nom TEXT," + "prenom TEXT,"
				+ "fonction TEXT" + ");";
	}

	public void Ajouter() {
		String requetC = "INSERT INTO Employe (nom,prenom,fonction) VALUES ('" + nom + "','" + prenom + "','"
				+ fonction + "')";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetC);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Modifier() {
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

	public void Delete() {
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
}
