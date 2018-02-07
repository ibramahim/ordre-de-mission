package DataBase;

import classesForImplementsControllers.Sortie;

public class Disponible {
	public EmployeEtat dispoCongOuMiss;
	DataBaseClass ocupation;
	Sortie soitCongeOuMission;
	public Disponible(EmployeEtat dis , DataBaseClass occ){
		dispoCongOuMiss = dis;
		ocupation = occ;
	}
	
	public Disponible(EmployeEtat dis , Sortie occ){
		dispoCongOuMiss = dis;
		soitCongeOuMission = occ;
	}
	
	public Disponible(EmployeEtat dis){
		dispoCongOuMiss = dis;
	}
}
