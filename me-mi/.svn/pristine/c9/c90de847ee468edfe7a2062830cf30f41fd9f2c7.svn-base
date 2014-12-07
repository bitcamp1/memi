package com.memi.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Value;

import com.memi.web.common.utils.JDBCClose;
import com.memi.web.common.utils.JDBCconn;

public abstract class AbstractDao {
	@Value("${driverClassName}") String driver;
	@Value("${url}") String url;
	@Value("${username}") String id;
	@Value("${password}") String pw;
	ResultSet rs = null;
	Connection con = null;
	PreparedStatement ps = null;
	JDBCconn jdbccon = null;
	
	
    public AbstractDao() {
    	jdbccon = new JDBCconn();
	}

	public final void execute() {
                 
                  try {
                               init();
                               query();
                               close();
                  } catch (Exception ex) {
                               ex.printStackTrace();
                  }
    }
   
    private void init() throws Exception {
    	con = jdbccon.getCon();
    }
    public abstract void query() throws Exception;
    private void close() {
    	JDBCClose.close(con, ps, rs);
    }
}
