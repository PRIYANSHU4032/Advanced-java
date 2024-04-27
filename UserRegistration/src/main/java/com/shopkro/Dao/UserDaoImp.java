package com.shopkro.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopkro.util.DButil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isVaildUser(String username, String password) {
		
		String query = "select * from Usersdata where username = ? and password = ?";
		try(Connection connection = DButil.getConnection();
				PreparedStatement pst = connection.prepareStatement(query)){
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			System.out.println("run successfully");
			return rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean addUser(Usersdata userdata) {
		// TODO Auto-generated method stub
		String query = "Insert into Usersdata (username , password,email) values (?,?,?)";
		
		try(Connection connection = DButil.getConnection(); 
				PreparedStatement pst1 = connection.prepareStatement(query)){
			pst1.setString(1, userdata.getUsername());
			pst1.setString(2, userdata.getPassword());
			pst1.setString(3, userdata.getEmail());
			
			int roweffected = pst1.executeUpdate();
			System.out.println("run successfully");
			return roweffected >0;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	

}
