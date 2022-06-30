package in.sina.projects.test;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.sina.projects.util.DbConnectionOnce;

public class TestDbConUtil {

	@Test
	public void testGetCon() {
		Connection con1 = DbConnectionOnce.getCon();
		Connection con2 = DbConnectionOnce.getCon();
		
		if(con1==null  || con2==null) {
			Assertions.fail("Connection are not create"
					);
		}
		Assertions.assertSame(con1, con2,"May not be same Connection!");
	}
}
