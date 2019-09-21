package com.zjsru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjsru.bean.Category;
import com.zjsru.mapper.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public Category findCategoryByCa_id(int ca_id) {
		// TODO Auto-generated method stub
		Category category=categoryDao.selectCategoryByCa_id(ca_id);
		return category;
	}
	
}
