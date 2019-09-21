package com.zjsru.service;

import java.util.List;

import com.zjsru.bean.Commodity;

public interface CommodityService {
	void addCommodity(Commodity commodity);

	void deleteCommodity(int cid);

	void updateCommodity(Commodity commodity);

	Commodity findByCname(String cname);

	Commodity findByCid(int cid);

	List<Commodity> findAllCommodity();
}
