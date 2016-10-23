package pers.fhr.autogenerate.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pers.fhr.autogenerate.roleauthInterceptor.RoleControl;

@Controller
public class MainController {
	@RequestMapping("/index")
	@RoleControl(roles={"user","admin"})
	public ModelAndView index(HttpSession session){
		return new ModelAndView("index","user",session.getAttribute("user"));
	}
}
