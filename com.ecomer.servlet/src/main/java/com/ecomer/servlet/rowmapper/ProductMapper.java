package com.ecomer.servlet.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecomer.servlet.model.ProductModel;

public class ProductMapper implements IRowMapper<ProductModel> {

	@Override
	public ProductModel mapRow(ResultSet rs) {
		try {
			ProductModel productModel = new ProductModel();
			productModel.setId(rs.getLong("id"));
			productModel.setName(rs.getString("name"));
			productModel.setImage(rs.getString("image"));
			productModel.setPrice(rs.getDouble("price"));
			productModel.setTitle(rs.getString("title"));
			productModel.setDescription(rs.getString("description"));
			productModel.setCategoryId(rs.getLong("categoryId"));

					
		} catch (SQLException e) {
			return null;
		}
		return null;
	}

}
