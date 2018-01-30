package DataBase;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseClass db = new DataBaseClass();
		Emplyer e = new Emplyer(12,"ben ayoub" ,"brahim" , "informatique");
		Mission m = new Mission(1, "bouchemdjen", "afraz n tini", "01/02/2018", "10/10/2018", 1);
		Conge c = new Conge(145 , "03/03/2018" , "04/04/2018" , 1);
		e.Ajouter();
		m.ajouter();
		c.ajouter();
	}

}
	