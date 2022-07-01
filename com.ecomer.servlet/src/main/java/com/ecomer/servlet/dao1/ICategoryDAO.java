package com.ecomer.servlet.dao1;

import java.util.List;

import com.ecomer.servlet.model.CategoryModel;

public interface ICategoryDAO extends IGenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
	CategoryModel fineOne(long id);
	CategoryModel findOneByCode(String code);
}
