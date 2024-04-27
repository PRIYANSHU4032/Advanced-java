package priyanshu.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbcon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection==null) {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Avengers", "postgres", "8539909495");
			System.out.println("connected");	
		}
		return connection;
	}
	
	
	
}
