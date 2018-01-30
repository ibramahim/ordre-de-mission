

public class emplyer extends DatBaseClass {
	protected int id;
	public String nom;
	public String prenom;
	public String fonction;
	
	public String getCreateTableQuery(){
		return "CREATE TABLE Employe ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT ,"
				+ "nom TEXT,"
				+ "prenom TEXT,"
				+ "fonction TEXT"
				+ ");";
	}
}
