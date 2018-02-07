package DataBase;

import javafx.beans.property.SimpleStringProperty;

public enum EmployeEtat {
DISPONIBLE("disponible"),DANSUNECONGE("Conge"),DansUneMission("en mission");
SimpleStringProperty etat;
	private EmployeEtat(String s){
		etat = new SimpleStringProperty(s);
	}
	public SimpleStringProperty getEtat() {
		return etat;
	}
}
