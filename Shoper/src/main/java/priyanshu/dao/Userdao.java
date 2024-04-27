package priyanshu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import priyanshu.user.Usermodel;

public class Userdao {
	private Connection conn;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	public Userdao(Connection conn) {
		
		this.conn = conn;
	}
	
	public Usermodel userLogin(String username,String password) {
		Usermodel user = null;
		try {
			query = "select * from Usersdata where name = ? and password = ?";
			pst = this.conn.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				user = new Usermodel();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getNString("email"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
		return user;
	}
	
	
	
}
