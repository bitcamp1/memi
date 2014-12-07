package com.memi.web.common.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCClose {
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			try {
				if(rs!=null) { rs.close(); rs=null;}
			}catch(Exception e) {}
			
			try {
				if(ps!=null) { ps.close(); ps=null; }
			}catch(Exception e) {}
			
			try {
				if(con!=null) { con.close(); con=null; }
			}catch(Exception e) {}
		}catch(Exception e) {}
	}
	
	public static void close(Connection con, PreparedStatement ps) {
		try {
			try {
				if(ps!=null) { ps.close(); ps=null; }
			}catch(Exception e) {}
			
			try {
				if(con!=null) { con.close(); con=null; }
			}catch(Exception e) {}
		}catch(Exception e) {}
	}


	public static void close(Connection con) {
		try {
			try {
				if(con!=null) { con.close(); con=null; }
			}catch(Exception e) {}
		}catch(Exception e) {}
	}
	
	public static void close(PreparedStatement ps) {
		try {
			try {
				if(ps!=null) { ps.close(); ps=null; }
			}catch(Exception e) {}
		
		}catch(Exception e) {}
	}
	
	
	public static void close(ResultSet rs) {
		try {
			try {
				if(rs!=null) { rs.close(); rs=null; }
			}catch(Exception e) {}

		}catch(Exception e) {}
	}
	
	public static void close(PreparedStatement ps, ResultSet rs) {
		try {
			try {
				if(rs!=null) { rs.close(); rs=null; }
			}catch(Exception e) {}
			
			try {
				if(ps!=null) { ps.close(); ps=null; }
			}catch(Exception e) {}

		}catch(Exception e) {}
	} 
}
