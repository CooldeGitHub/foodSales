package com.zjsru.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zjsru.bean.Commodity;
import com.zjsru.bean.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjsru.bean.Order;
import com.zjsru.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;


	@RequestMapping(value = "/findAllOrder",method = RequestMethod.GET)
	@ResponseBody
	public List findAllOrder() {
		List<Order> orders = orderService.findAllOrder();
		return orders;
	}
	@RequestMapping(value = "/orderManage", method = RequestMethod.GET)
	public String orderManage() {
		return "order.html";
	}
	
	

	@RequestMapping(value = "/findOrder")
	public String findOrder() {
		return "findOrder";
	}

	@RequestMapping(value = "/findByOid", method = RequestMethod.POST)
	public String findByOid(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		int oid = Integer.parseInt(req.getParameter("oid"));
		Order order = orderService.findByOid(oid);
		model.addAttribute("order", order);
		return "order";
	}

	@RequestMapping(value = "/add")
	public String add() {
		return "add";
	}

//	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
//	public String addOrder(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
//		req.setCharacterEncoding("UTF-8");
//		Order order = new Order();
//		order.setOid(Integer.parseInt(req.getParameter("oid")));
//		order.setAid(Integer.parseInt(req.getParameter("aid")));
//		order.setCid(Integer.parseInt(req.getParameter("cid")));
//		order.setCount(Integer.parseInt(req.getParameter("count")));
//		order.setSum(Integer.parseInt(req.getParameter("sum")));
//		order.setState(Integer.parseInt(req.getParameter("state")));
//		orderService.addOrder(order);
//		return "redirect:findAllOrder";
//	}
	@ResponseBody
	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	public Order addOrder(@RequestBody String json)  {
		try {
			JSONObject jsonObject = JSON.parseObject(json);
			int aid =Integer.parseInt(jsonObject.get("aid").toString());
			List<Object> list =jsonObject.getJSONArray("commodities");
			Float sum = Float.parseFloat(jsonObject.get("sum").toString());
			int count = Integer.parseInt(jsonObject.get("count").toString());
			Order order = new Order();
			order.setAid(aid);
			order.setSum(sum);
			order.setCount(count);
			order.setState(0);
			int oid = orderService.addOrder(order);
			for (Object o:list) {
				JSONObject commodityObject = (JSONObject)o;
				ShoppingCart shopCart = new ShoppingCart();
				shopCart.setCname(commodityObject.get("cname").toString());
				shopCart.setPrice(Float.parseFloat(commodityObject.get("price").toString()));
				shopCart.setOid(oid);
				shopCart.setCid(Integer.parseInt(commodityObject.get("cid").toString()));
			}
			return order;
		}catch (Exception e){
			return new Order();
		}

	}

	@RequestMapping(value = "/update")
	public String update(HttpServletRequest req, Model model) {
		int oid = Integer.parseInt(req.getParameter("oid"));
		Order order = orderService.findByOid(oid);
		model.addAttribute("order", order);
		return "update";
	}

	@RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
	public String updateOrder(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Order order = new Order();
		order.setOid(Integer.parseInt(req.getParameter("oid")));
		order.setAid(Integer.parseInt(req.getParameter("aid")));
		order.setCid(Integer.parseInt(req.getParameter("cid")));
		order.setCount(Integer.parseInt(req.getParameter("count")));
		order.setSum(Integer.parseInt(req.getParameter("sum")));
		order.setState(Integer.parseInt(req.getParameter("state")));
		System.out.print(order.toString());
		orderService.updateOrder(order);
		return "redirect:findAllOrder";
	}
}
