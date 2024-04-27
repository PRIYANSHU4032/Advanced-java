package com.shopkro.Dao;

import java.sql.SQLException;

public interface UserDao {

	boolean isVaildUser(String username, String password);

	 boolean addUser(Usersdata userdata);
	

	

}
