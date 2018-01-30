package DataBase;

import java.util.Date;

public class Employe {
	
	String nom, prenom, fonction;

	public Employe(String nom, String prenom, String fonction) {
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
	}

	public String getCreateTableQuery() {
		return "CREATE TABLE Employe ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "nom TEXT ,"
				+ "prenom TEXT ,"
				+ "fonction TEXT "
				+ ")";

	}/* create table .... */

	public String InsertThisIntoDB() {
		return "INSERT INTO Employe(nom , prenom , fonction) VALUES ("+nom+","+prenom+","+fonction+");";
	}/* insert Into Query ... */

}
