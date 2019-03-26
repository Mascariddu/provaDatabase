package it.polito.tdp.provadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public void run() {
		
		String jdbcURL = "jdbc:mysql://localhost/dizionario?useTimezone=true&serverTimezone=UTC&user=root&password=toro1997";
			
		try {
			
		Connection conn= DriverManager.getConnection(jdbcURL);
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM parola "+
				"WHERE nome LIKE 'Z%'";
		
		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			
			System.out.println(nome);
		}
		conn.close();
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main test = new Main();
		test.run();
	}

}
