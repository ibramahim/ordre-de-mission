package classesForImplementsControllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DataBase.Disponible;
import DataBase.EmployeEtat;
import javafx.beans.property.SimpleStringProperty;

public class MissionProperty extends Sortie{
	private int id;
	private SimpleStringProperty lieu;
	private SimpleStringProperty projet;
	private SimpleStringProperty Ddebut;
	private SimpleStringProperty Dfin;
	private EmployeProperty employe;

	public MissionProperty(int id, String ddebut, String dfin , String lieu, String projet , EmployeProperty e) {
		super();
		this.id = id;
		this.lieu = new SimpleStringProperty(lieu);
		this.projet = new SimpleStringProperty(projet);
		Ddebut = new SimpleStringProperty(ddebut);
		Dfin = new SimpleStringProperty(dfin);
		this.employe = e;
		Disponible d = isEmployeDispo()?new Disponible(EmployeEtat.DISPONIBLE) : new Disponible(EmployeEtat.DansUneMission, this);
		e.setDisponibilite(d);
	}

	public int getId() {
		return id;
	}

	public SimpleStringProperty getLieuProperty() {
		return lieu;
	}

	public SimpleStringProperty getProjetProperty() {
		return projet;
	}

	public SimpleStringProperty getDdebutProperty() {
		return Ddebut;
	}

	public SimpleStringProperty getDfinProperty() {
		return Dfin;
	}

	public EmployeProperty getEmployeProperty() {
		return employe;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLieu(String lieu) {
		this.lieu = new SimpleStringProperty(lieu);
	}

	public void setProjet(String projet) {
		this.projet =  new SimpleStringProperty(projet);
	}

	public void setDdebut(String ddebut) {
		Ddebut =  new SimpleStringProperty(ddebut);
	}

	public void setDfin(String dfin) {
		Dfin =  new SimpleStringProperty(dfin);
	}

	public void setEmploye(EmployeProperty employe) {
		this.employe = employe;
	}
	public boolean isEmployeDispo(){
		return !isSupperieurOfToday(Ddebut.getValue()) && isSupperieurOfToday(Dfin.getValue());
	}
}

