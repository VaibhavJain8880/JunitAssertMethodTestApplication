package in.sina.projects.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import in.sina.projects.JUnitAssertMethodTestExApplication;
import in.sina.projects.service.Message;

public class TestMessage {
	private Message m;
	private String expected;
	private String actual;
	
	@BeforeEach
	private void setup() {
		m = new Message();
		expected = "Welcome to :SAM";
		actual ="";
	}
	
	@Test
	public void testShowMsg() {
		actual = m.showMsg("SAM");
		Assertions.assertEquals(expected, actual);
		
	}
	@AfterEach
	public void clean() {
		m = null;
		expected = actual = null;
	}
	
	}

