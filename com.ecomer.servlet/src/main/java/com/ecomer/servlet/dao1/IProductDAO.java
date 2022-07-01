package com.ecomer.servlet.dao1;

import java.util.List;

import com.ecomer.servlet.model.ProductModel;

public interface IProductDAO extends IGenericDAO<ProductModel> {
	
	List<ProductModel> findByCategoryId(long categoryId);
	ProductModel fineOne(long id);
	
	int getTotalItem();
}
