package classesForImplementsControllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DataBase.Disponible;
import DataBase.EmployeEtat;
import DataBase.Emplyer;
import javafx.beans.property.SimpleStringProperty;

public class CongeProperty extends Sortie{
	private int id;
	private SimpleStringProperty Ddebut;
	private SimpleStringProperty Dfin;
	private EmployeProperty employe;

	public int getId() {
		return id;
	}

	public SimpleStringProperty getDdebut() {
		return Ddebut;
	}

	public SimpleStringProperty getDfin() {
		return Dfin;
	}

	public EmployeProperty getEmploye() {
		return employe;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDdebut(String ddebut) {
		Ddebut = new SimpleStringProperty(ddebut);
	}

	public void setDfin(String dfin) {
		Dfin = new SimpleStringProperty(dfin);
	}

	public void setEmploye(EmployeProperty employe) {
		this.employe = employe;
	}

	public CongeProperty(int id, String ddebut, String dfin, EmployeProperty e) {
		this.id = id;
		Ddebut = new SimpleStringProperty(ddebut);
		Dfin = new SimpleStringProperty(dfin);
		this.employe = e;
		Disponible d = isEmployeDispo()?new Disponible(EmployeEtat.DISPONIBLE) : new Disponible(EmployeEtat.DANSUNECONGE, this);// 1 pour conge
		e.setDisponibilite(d);
	}
	public boolean isEmployeDispo(){
		return !isSupperieurOfToday(Ddebut.getValue()) && isSupperieurOfToday(Dfin.getValue());
	}

}
