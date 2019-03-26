package it.polito.tdp.provadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import it.poltio.tdp.provadb.model.Parola;

public class DizionarioDAO {

	public boolean esisteParola(String nome) {
		
		Connection conn = dbConnect.getConnection();
		
		try {
		
		String sql= "SELECT id,nome FROM parola WHERE nome= ?";
		PreparedStatement st= conn.prepareStatement(sql);
		st.setString(1, nome);
		ResultSet rs= st.executeQuery();
		
		boolean result;
		if(rs.next()) {
			result=true;
		} else {
			result = false;
		}
		
		conn.close();
		return result;
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*public List<Parola> listAll(){
		
	}
	
	public void creaParola(Parola nuova) {
		
	}*/
}
