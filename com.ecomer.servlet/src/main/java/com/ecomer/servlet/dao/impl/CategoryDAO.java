package com.ecomer.servlet.dao.impl;

import java.util.List;

import com.ecomer.servlet.dao1.ICategoryDAO;
import com.ecomer.servlet.model.CategoryModel;
import com.ecomer.servlet.rowmapper.CategoryMapper;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "select * from Category";

		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel fineOne(long id) {
		String sql = "Select * from Category where id =?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), id);
		return category.isEmpty() ? null : category.get(0);
	}

	@Override
	public CategoryModel findOneByCode(String code) {
		String sql = "Select * from category where code = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), code);
		return category.isEmpty() ? null : category.get(0);
	}

}
