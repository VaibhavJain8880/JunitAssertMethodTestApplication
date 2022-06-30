package in.sina.projects.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public Connection getCon() throws SQLException, ClassNotFoundException {
	Connection con = null;
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","vaibhav@8880");
	return con;
	}

}
