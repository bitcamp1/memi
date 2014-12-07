package com.memi.web.common.utils;
import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCconn {
/*	@Value("${driverClassName}") String driver;
	@Value("${url}") String url;
	@Value("${username}") String id;
	@Value("${password}") String pw;*/
	
	public JDBCconn() {}

	Connection con;
     /**
	 * @return the con
	 */
	public Connection getCon() {
		
		Connection con = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:sqlserver://sql8ssd-010.localnet.kr:1433;DatabaseName=whitews2_ws88",
					"whitews2_ws88",
					"wwss2258");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

	/**
	 * @param con the con to set
	 */
	public void setCon(Connection con) {
		this.con = con;
	}

	

}
