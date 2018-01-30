package DataBase;

import java.sql.Statement;

public class Conge extends DataBaseClass {
	protected int id;
	public String Ddebut;
	public String Dfin;
	public int employe;

	public Conge(int id, String ddebut, String dfin, int employe) {
		super();
		this.id = id;
		Ddebut = ddebut;
		Dfin = dfin;
		this.employe = employe;
	}

	public static String getCreateTableQuery() {
		return "CREATE TABLE Conge (" + "id INTEGER PRIMARY KEY AUTOINCREMENT ," + "Ddebut TEXT," + "Dfin TEXT"
				+ ",employe INTEGER , FOREIGN KEY(employe) REFERENCES employe(id));";
	}

	public void ajouter() {
		String requetC = "INSERT INTO Conge(Ddebut , Dfin , employe) VALUES ('" + Ddebut + "','" + Dfin + "' , "
				+ employe + ");";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetC);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifier() {
		String requetC = "UPDATE Conge SET Ddebut = '" + Ddebut + "',Dfin = '" + Dfin + "' , employe = " + employe
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

	public void Delete() {
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
}
