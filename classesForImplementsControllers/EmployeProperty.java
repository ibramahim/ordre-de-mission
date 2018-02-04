package classesForImplementsControllers;

import DataBase.Emplyer;
import javafx.beans.property.SimpleStringProperty;

public class EmployeProperty {
	int id;
	private SimpleStringProperty nom;
	private SimpleStringProperty prenom;
	private SimpleStringProperty fonction;
	String disponible;
	public EmployeProperty(int id ,String nom , String prenom , String fonction){
		this.id = id;
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.fonction = new SimpleStringProperty(fonction);
	}
	public EmployeProperty(Emplyer e){
		this.id = e.id;
		this.nom = new SimpleStringProperty(e.nom);
		this.prenom = new SimpleStringProperty(e.prenom);
		this.fonction = new SimpleStringProperty(e.fonction);
	}
	public int getId() {
		return id;
	}
	public SimpleStringProperty getNomProperty() {
		return nom;
	}
	public SimpleStringProperty getPrenomProperty() {
		return prenom;
	}
	public SimpleStringProperty getFonctionProperty() {
		return fonction;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = new SimpleStringProperty(nom);
	}
	public void setPrenom(String prenom) {
		this.prenom = new SimpleStringProperty(prenom);
	}
	public void setFonction(String fonction) {
		this.fonction = new SimpleStringProperty(fonction);
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	
}
