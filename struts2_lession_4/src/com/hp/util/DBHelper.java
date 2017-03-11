package com.hp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

	private static final String DRIVERCLASS = "oracle.jdbc.OracleDriver";

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";

	private static final String USERNAME = "scott";

	private static final String PASSWORD = "tiger";

	public static Connection getConn() {

		try {
			
			Class.forName(DRIVERCLASS);
			
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(getConn());
	}
}
