package com.zjsru.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zjsru.bean.Manager;
import com.zjsru.bean.User;
import com.zjsru.service.ManagerService;
import com.zjsru.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ManagerService managerService;

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public String checkLogin(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		User user = new User();
		userService.checkLogin(user.getUid(), user.getUname(), user.getPassword());
		if (user != null) {
			model.addAttribute("user", user);
			return "redirect:/";
		}
		return "fail.jsp";
	}
	@RequestMapping(value = "/checkManagerLogin", method = RequestMethod.POST)
	public String checkManagerLogin(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Manager manager = new Manager();
		managerService.checkLogin(manager.getId(),manager.getPassword());
		if (manager != null) {
			model.addAttribute("manager", manager);
			return "redirect:/";
		}
		return "fail.jsp";
	}

	@RequestMapping("/regist")
	public String regist() {
		return "regist.jsp";
	}
	@RequestMapping(value = "/doRegist", method = RequestMethod.POST)
	public String doRegist(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		User user = new User();
		user.setUid(Integer.parseInt(req.getParameter("uid")));
		user.setUname(req.getParameter("uname"));
		user.setPassword(req.getParameter("password"));
		userService.Regist(user);
		return "success.jsp";
	}
	
	@RequestMapping("/managerRegist")
	public String managerRegist() {
		return "managerRegist.jsp";
	}
	@RequestMapping(value = "/doManagerRegist", method = RequestMethod.POST)
	public String doManagerRegist(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Manager manager = new Manager();
		manager.setId(Integer.parseInt(req.getParameter("id")));
		manager.setPassword(req.getParameter("password"));
		managerService.Regist(manager);
		return "success.jsp";
	}
	
	@RequestMapping(value = "/findByUid",method = RequestMethod.GET)
	@ResponseBody
	public User findByUid(HttpServletRequest req) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		User user = userService.findByUid(uid);
		return user;
	}
	@RequestMapping(value = "/userManage", method = RequestMethod.GET)
	public String userManage() {
		return "user.html";
	}
}
