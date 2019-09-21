package com.zjsru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjsru.bean.Commodity;
import com.zjsru.mapper.CommodityDao;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityDao commodityDao;

	@Override
	public void addCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		commodityDao.insertCommodity(commodity);
	}

	@Override
	public void deleteCommodity(int cid) {
		// TODO Auto-generated method stub
		commodityDao.deleteCommodity(cid);
	}

	@Override
	public void updateCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		commodityDao.updateCommodity(commodity);

	}

	@Override
	public Commodity findByCname(String cname) {
		// TODO Auto-generated method stub
		Commodity commodity = commodityDao.selectByCname(cname);
		return commodity;
	}

	@Override
	public Commodity findByCid(int cid) {
		// TODO Auto-generated method stub
		Commodity commodity = commodityDao.selectByCid(cid);
		return commodity;
	}

	@Override
	public List<Commodity> findAllCommodity() {
		// TODO Auto-generated method stub
		List<Commodity> commoditys = commodityDao.selectAllCommodity();
		return commoditys;
	}
}
