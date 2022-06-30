package in.sina.projects.test;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import in.sina.projects.util.DbConnection;

public class TestDbConnection {

	private DbConnection dbc;
	private Connection con;
	
	@BeforeEach
	public void setup() {
		dbc=new DbConnection();
	}
	@Test
	public void testGetCon() {
		Assertions.assertDoesNotThrow(()->{
			con=dbc.getCon();
		});
		Assertions.assertNotNull(con, "Connection is not created ,Please check!!");
	}
	@AfterEach
	public void clean() {
		dbc=null;
		con=null;
	}
}
