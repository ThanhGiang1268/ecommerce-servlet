package com.ecomer.servlet.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.ecomer.servlet.dao1.IGenericDAO;
import com.ecomer.servlet.rowmapper.IRowMapper;

public class AbstractDAO<T> implements IGenericDAO<T> {

	ResourceBundle rb = ResourceBundle.getBundle("db");

	public Connection getConnection() {
		try {
			Class.forName(rb.getString("driverName"));
			String url = rb.getString("url");
			String user = rb.getString("user");
			String password = rb.getString("password");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public <T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters) {
		List<T> results = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			setParameter(ps, parameters);
			rs = ps.executeQuery();
			while (rs.next()) {
				results.add(rowMapper.mapRow(rs));
			}
			return results;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
		return null;
	}

	private void setParameter(PreparedStatement ps, Object[] parameters) {
		try {
			for(int i = 0;i <= parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if(parameter instanceof Long) {
					ps.setLong(index, (Long) parameter);
				} else if (parameter instanceof String) {
					ps.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					ps.setInt(index, (Integer) parameter);
				} else if (parameter instanceof Timestamp) {
					ps.setTimestamp(index, (Timestamp) parameter);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(String sql, Object... parameters) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long insert(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		return 0;
	}
}
