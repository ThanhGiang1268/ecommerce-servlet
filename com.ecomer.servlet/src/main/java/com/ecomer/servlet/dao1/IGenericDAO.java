package com.ecomer.servlet.dao1;

import java.util.List;

import com.ecomer.servlet.rowmapper.IRowMapper;



public interface IGenericDAO<T>  {
	<T> List<T> query(String sql, IRowMapper<T> rowMapper,Object... parameters );
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
	
}
