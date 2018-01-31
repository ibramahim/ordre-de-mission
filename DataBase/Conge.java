package DataBase;

import java.sql.ResultSet;
import java.sql.Statement;

public class Conge extends DataBaseClass {
	protected int id;
	public String Ddebut;
	public String Dfin;
	public Emplyer employe;

	public Conge(int id, String ddebut, String dfin, Emplyer e) {
		super();
		this.id = id;
		Ddebut = ddebut;
		Dfin = dfin;
		this.employe = e;
	}

	public static String getCreateTableQuery() {
		return "CREATE TABLE Conge (" + "id INTEGER PRIMARY KEY AUTOINCREMENT ," + "Ddebut TEXT," + "Dfin TEXT"
				+ ",employe INTEGER , FOREIGN KEY(employe) REFERENCES employe(id));";
	}

	public void ajouter() {
		String requetC = "INSERT INTO Conge(Ddebut , Dfin , employe) VALUES ('" + Ddebut + "','" + Dfin + "' , "
				+ employe.id + ");";
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
		String requetC = "UPDATE Conge SET Ddebut = '" + Ddebut + "',Dfin = '" + Dfin + "' , employe = " + employe.id
				+ " WHERE id = " + id + ";";
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
		String requetC = "DELETE FROM Conge WHERE id = " + id + ";";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetC);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return id + " , " + Ddebut + " , " + Dfin + " , " + employe.nom + " , " + employe.prenom;
	}
}
