
public class mission extends DatBaseClass {
	protected int id;
	public String lieu;
	public String projet;
	public Date Ddebut;
	public Date Dfin;
	
	public String getCreateTableQuery(){
		return "CREATE TABLE Mission ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT ,"
				+ "Ddebut TEXT,"
				+ "Dfin TEXT,"
				+ "lieu TEXT,"
				+ "projet TEXT"
				+ ");";
	}

}
