package DataBase;

import java.util.Date;


public class Etudiant {
	String nom , prenom ;
	Date dateDebut , dateFin;
	//je ne sait pas quelle class on d�finit pour une date je mit Date et toi chercher ce qu'il faut 
	//sinon mit String 
	
	//constructeur
	
	public String getCreateTableQuery(){
		return "";
		
	}/*create table .... */
	
	public String getInsertIntoQuery(){
		return "";
	}/*insert Into Query ...*/
	
}
