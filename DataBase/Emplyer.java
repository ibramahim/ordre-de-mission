package DataBase;

import java.sql.ResultSet;
import java.sql.Statement;

import classesForImplementsControllers.EmployeProperty;

public class Emplyer extends DataBaseClass {
	public int id;
	public String nom;
	public String prenom;
	public String fonction;
	public Disponible laDisponibilite;
	
	public Emplyer(int id, String nom, String prenom, String fonction) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		laDisponibilite = new Disponible(EmployeEtat.DISPONIBLE);
	}
	public Emplyer(EmployeProperty e){
		super();
		this.id = e.getId();
		this.nom = e.getNomProperty().getValue();
		this.prenom = e.getPrenomProperty().getValue();
		this.fonction = e.getFonctionProperty().getValue();
	}
	public Emplyer(int id){
		this.id = id;
	}
	public void setDisponibilite(Disponible d){
		laDisponibilite = d;
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
	public boolean equals(Object o){
		Emplyer e  = (Emplyer)o;
		return e.id == id;
	}
}
