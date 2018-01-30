
public class conge extends DatBaseClass {
	protected int id;
	public String Ddebut;
	public String Dfin;
	
	public String getCreateTableQuery(){
		return "CREATE TABLE Mission ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT ,"
				+ "Ddebut TEXT,"
				+ "Dfin TEXT"
				+ ");";
	}
}
