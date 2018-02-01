package classesForImplementsControllers;

import javafx.beans.property.SimpleStringProperty;

public class MissionProperty {
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
	
}

