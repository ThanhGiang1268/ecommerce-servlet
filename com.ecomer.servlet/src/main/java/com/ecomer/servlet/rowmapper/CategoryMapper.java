package com.ecomer.servlet.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecomer.servlet.model.CategoryModel;

public class CategoryMapper implements IRowMapper<CategoryModel>{

	@Override
	public CategoryModel mapRow(ResultSet rs) {
		try {
			CategoryModel categoryModel = new CategoryModel();
			categoryModel.setId(rs.getLong("id"));
			categoryModel.setCode(rs.getString("code"));
			categoryModel.setName(rs.getString("name"));
			return categoryModel;
		} catch(SQLException e) {
			return null;
		}
		
	}
	
}
