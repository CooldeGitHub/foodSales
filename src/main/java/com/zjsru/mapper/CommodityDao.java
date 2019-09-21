package com.zjsru.mapper;

import java.util.List;

import com.zjsru.bean.Commodity;

public interface CommodityDao {
	void insertCommodity(Commodity commdity);

	void deleteCommodity(int cid);

	void updateCommodity(Commodity commdity);

	Commodity selectByCname(String cname);

	Commodity selectByCid(int cid);

	List<Commodity> selectAllCommodity();
}
