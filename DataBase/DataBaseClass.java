package DataBase;

import java.io.File;
import java.sql.*;

import java.util.ArrayList;

import classesForImplementsControllers.EmployeProperty;

public class DataBaseClass {

	static Connection connection;

	public DataBaseClass() {

		boolean existe = new File("data.db").exists();
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:data.db");
			if (!existe) {
				stmt = connection.createStatement();
				stmt.executeUpdate(Mission.getCreateTableQuery());
				stmt.executeUpdate(Emplyer.getCreateTableQuery());
				stmt.executeUpdate(Conge.getCreateTableQuery());
				stmt.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Emplyer> getAllEmployes() {
		Statement stmt = null;
		ResultSet res = null;
		ArrayList<Emplyer> empls = new ArrayList<>();
		try {
			stmt = connection.createStatement();
			res = stmt.executeQuery("SELECT * FROM Employe;");
			while (res.next()) {
				empls.add(new Emplyer(res.getInt("id"), res.getString("nom"), res.getString("prenom"),
						res.getString("fonction")));
			}
			return empls;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<EmployeProperty> getAllEmployesProperty() {
		Statement stmt = null;
		ResultSet res = null;
		ArrayList<EmployeProperty> empls = new ArrayList<>();
		try {
			stmt = connection.createStatement();
			res = stmt.executeQuery("SELECT * FROM Employe;");
			while (res.next()) {
				empls.add(new EmployeProperty(res.getInt("id"), res.getString("nom"), res.getString("prenom"),
						res.getString("fonction")));
			}
			return empls;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Mission> getAllMissions() {
		Statement stmt = null;
		ResultSet res = null;
		ArrayList<Mission> empls = new ArrayList<>();
		try {
			stmt = connection.createStatement();
			res = stmt.executeQuery(
					"SELECT Mission.id,Ddebut , Dfin,lieu , projet , employe,nom,prenom,fonction FROM Mission , Employe"
							+ " WHERE Mission.employe = Employe.id ;");
			while (res.next()) {
				Emplyer e = new Emplyer(res.getInt("employe"),res.getString("nom"), res.getString("prenom"), res.getString("fonction"));
				empls.add(new Mission(res.getInt(1), res.getString("Ddebut"), res.getString("Dfin"),
						res.getString("lieu"), res.getString("projet"), e));
			}
			return empls;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Conge> getAllConges() {
		Statement stmt = null;
		ResultSet res = null;
		ArrayList<Conge> empls = new ArrayList<>();
		try {
			stmt = connection.createStatement();
			res = stmt.executeQuery("SELECT Conge.id , Ddebut , Dfin ,employe, nom , prenom , fonction FROM Conge , Employe WHERE "
					+ "employe = Employe.id ;");
			while (res.next()) {
				Emplyer e = new Emplyer(res.getInt("employe"),res.getString("nom"), res.getString("prenom"), res.getString("fonction"));
				empls.add(new Conge(res.getInt("id"), res.getString("Ddebut"), res.getString("Dfin"),
						e));
			}
			return empls;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
