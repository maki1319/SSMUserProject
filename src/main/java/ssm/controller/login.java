package ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.pojo.User;
import unit.U;

@Controller
@RequestMapping("/login")
public class login {
	//跳转到登录页面
	@RequestMapping("/first")
	public String reLogin() {
		return "login";
	}
	//登录页面的判断
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model,HttpSession session) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User user = new User();
		if(name.equals("ssm") && password.equals("123")) {
			user.setId(U.getUUID());
			user.setUsername(name);
			user.setPassword(password);
			session.setAttribute("USER", user);
			return "redirect:tofirst";
		}
		model.addAttribute("b", false);
		return "login";
	}
	//跳转到首页
	@RequestMapping("/tofirst")
	public String toFirst() {
		return "firstPage";
	}
}
