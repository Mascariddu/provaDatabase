package it.polito.tdp.provadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {

	public static Connection getConnection() {
		
		try {
		String jdbcURL = "jdbc:mysql://localhost/dizionario?useTimezone=true&serverTimezone=UTC&user=root&password=toro1997";
		Connection conn= DriverManager.getConnection(jdbcURL);
		
		return conn;
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
