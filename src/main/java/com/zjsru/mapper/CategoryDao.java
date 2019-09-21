package com.zjsru.mapper;

import com.zjsru.bean.Category;

public interface CategoryDao {
	Category selectCategoryByCa_id(int ca_id);
}
