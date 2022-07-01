package com.ecomer.servlet.rowmapper;

import java.sql.ResultSet;

public interface IRowMapper<T> {
	T mapRow(ResultSet rs);
}
