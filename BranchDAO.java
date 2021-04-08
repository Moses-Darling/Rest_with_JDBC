package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BranchDAO {

	Connection conn=null;
	public BranchDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","linux");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Branch> getAllBranches(){
		List<Branch> resBranches=new ArrayList<Branch>();
		String query="select * from branch";
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Branch b=new Branch();
				b.setBid(rs.getString(1));
				b.setBname(rs.getString(2));
				b.setBcity(rs.getString(3));
				resBranches.add(b);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resBranches;
	}
}
