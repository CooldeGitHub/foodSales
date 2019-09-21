package com.zjsru.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjsru.bean.Category;
import com.zjsru.bean.Commodity;
import com.zjsru.service.CategoryService;
import com.zjsru.service.CommodityService;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/findAllCommodity")
	@ResponseBody
	public List findAllCommodity(Model model) {
		List<Commodity> commoditys = commodityService.findAllCommodity();
		model.addAttribute("commodity", commoditys);
		for (Commodity commodity : commoditys) {
			System.out.print(commodity.toString());
		}
		return commoditys;
	}

	@RequestMapping(value = "/commodityManage", method = RequestMethod.GET)
	public String commodityManage() {
		return "commoditymanage.html";
	}

	@RequestMapping(value = "/findCommodity")
	public String findCommodity() {
		return "findCommodity";
	}

	@RequestMapping(value = "/findByCname", method = RequestMethod.POST)
	public String findByCname(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		String cname = req.getParameter("cname");
		Commodity commodity = commodityService.findByCname(cname);
		model.addAttribute("commodity", commodity);
		return "commodity";
	}

	@RequestMapping(value = "/findCategoryByCa_id")
	public String findCategoryByCa_id(HttpServletRequest req, Model model) {
		int ca_id = Integer.parseInt(req.getParameter("ca_id"));
		Category category = categoryService.findCategoryByCa_id(ca_id);
		model.addAttribute("category", category);
		return "category";
	}

	@RequestMapping(value = "/add")
	public String add() {
		return "add";
	}

	@RequestMapping(value = "/addCommodity", method = RequestMethod.POST)
	public String addCommodity(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Commodity commodity = new Commodity();
		commodity.setCid(Integer.parseInt(req.getParameter("cid")));
		commodity.setCname(req.getParameter("cname"));
		commodity.setPrice(Float.parseFloat(req.getParameter("price")));
		commodity.setCa_id(Integer.parseInt(req.getParameter("ca_id")));
		commodity.setDa_id(Integer.parseInt(req.getParameter("da_id")));
		commodity.setC_count(Integer.parseInt(req.getParameter("c_count")));
		commodityService.addCommodity(commodity);
		return "redirect:findAllCommodity";
	}

	@RequestMapping(value = "/update")
	public String update(HttpServletRequest req, Model model) {
		String cname = req.getParameter("cname");
		Commodity commodity = commodityService.findByCname(cname);
		model.addAttribute("commodity", commodity);
		return "update";
	}

	@RequestMapping(value = "/updateCommodity", method = RequestMethod.POST)
	public String updateCommodity(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Commodity commodity = new Commodity();
		commodity.setCid(Integer.parseInt(req.getParameter("cid")));
		commodity.setCname(req.getParameter("cname"));
		commodity.setPrice(Float.parseFloat(req.getParameter("price")));
		commodity.setCa_id(Integer.parseInt(req.getParameter("ca_id")));
		commodity.setDa_id(Integer.parseInt(req.getParameter("da_id")));
		commodity.setC_count(Integer.parseInt(req.getParameter("c_count")));
		System.out.print(commodity.toString());
		commodityService.updateCommodity(commodity);
		return "redirect:findAllCommodity";
	}

	@RequestMapping(value = "/delete")
	public String deleteCommodity(HttpServletRequest req, Model model) {
		commodityService.deleteCommodity(Integer.parseInt(req.getParameter("cid")));
		return "redirect:findAllCommodity";
	}

}
