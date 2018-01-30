package DataBase;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseClass db = new DataBaseClass();
		Emplyer e = new Emplyer(12,"ben ayoub" ,"brahim" , "informatique");
		Mission m = new Mission(1, "01/02/2018", "10/10/2018", "bouchemdjen", "afraz n tini", 1);
		Conge c = new Conge(145 , "03/03/2018" , "04/04/2018" , 1);
		e.ajouter();
		m.ajouter();
		c.ajouter();
		ArrayList<Emplyer> lists = db.getAllEmployes();
		ArrayList<Mission> mis = db.getAllMissions();
		ArrayList<Conge> con = db.getAllConges();
		for(int i= 0 ; i < lists.size() ; i++)
			System.out.println(lists.get(i));
		System.out.println("==========================");
		for(int i= 0 ; i < mis.size() ; i++)
			System.out.println(mis.get(i));
		System.out.println("==========================");
		for(int i= 0 ; i < con.size() ; i++)
			System.out.println(con.get(i));
		
		
	}

}
	