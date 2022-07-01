package com.ecomer.servlet.dao.impl;

import java.util.List;

import com.ecomer.servlet.dao1.IProductDAO;
import com.ecomer.servlet.model.ProductModel;
import com.ecomer.servlet.rowmapper.ProductMapper;

public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO{

	@Override
	public List<ProductModel> findByCategoryId(long categoryId) {
		String sql = "Select * from Category";
				
		return query(sql, new ProductMapper() , categoryId);
	}

	@Override
	public ProductModel fineOne(long id) {
		
		return null;
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}

}
