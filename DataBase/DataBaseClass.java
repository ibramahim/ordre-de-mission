package DataBase;

import java.io.File;
import java.sql.*;

import java.util.ArrayList;

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

	public static void main(String[] args) {

	}

}
