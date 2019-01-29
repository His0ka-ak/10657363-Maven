package com.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.dto.Employee;

public class EmployeeDao {
	public void insert(Employee e) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("dev-db.properties");
			Properties dbProps = new Properties();
			dbProps.load(is);
			String driverClassName = dbProps.getProperty("driverClassName");
			String url = dbProps.getProperty("url");
			String username = dbProps.getProperty("username");
			String password = dbProps.getProperty("password");

			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, username, password);
			pstmt = conn.prepareStatement("insert into emp_tbl values(?,?,?)");
			pstmt.setString(1, e.getEmpno());
			pstmt.setString(2, e.getEmpname());
			pstmt.setString(3, e.getEmpsal());
			pstmt.executeQuery();
		} catch (Exception x) {
			x.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception x) {
			}
			try {
				conn.close();
			} catch (Exception x) {
			}
		}

	}

}
