package DataBase;

import java.sql.Statement;

public class Mission extends DataBaseClass {
	protected int id;
	public String lieu;
	public String projet;
	public String Ddebut;
	public String Dfin;
	public int employe;

	public Mission(int id, String ddebut, String dfin , String lieu, String projet , int employe) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.projet = projet;
		Ddebut = ddebut;
		Dfin = dfin;
		this.employe = employe;
	}

	public static String getCreateTableQuery() {
		return "CREATE TABLE Mission (" + "id INTEGER PRIMARY KEY AUTOINCREMENT ," + "Ddebut TEXT," + "Dfin TEXT,"
				+ "lieu TEXT," + "projet TEXT ,employe INTEGER , FOREIGN KEY(employe) REFERENCES employe(id)" + ");";
	}

	public void ajouter() {
		String requetM = "INSERT INTO Mission(Ddebut , Dfin , lieu , projet , employe ) VALUES ( '" + Ddebut + "' ,'"
				+ Dfin + "','" + lieu + "','" + projet + "', " + employe + ");";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetM);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifier() {
		String requetM = "UPDATE Mission SET Ddebut = '" + Ddebut + "' , Dfin = '" + Dfin + "', " + "lieu = '" + lieu
				+ "'," + " projet = '" + projet + "' , employe = " + employe + " WHERE id = " + id + ";";
		Statement statment = null;
		try {
			statment = connection.createStatement();
			statment.executeUpdate(requetM);
			statment.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		String requetC = "DELETE FROM Mission WHERE id = " + id + ";";
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
		return id+ " , "+Ddebut+" , "+Dfin+" , "+lieu+" , "+projet+" , "+employe;
	}
}
