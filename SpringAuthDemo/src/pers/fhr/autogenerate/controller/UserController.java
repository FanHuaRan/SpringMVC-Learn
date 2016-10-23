package pers.fhr.autogenerate.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pers.fhr.autogenerate.entity.Person;
import pers.fhr.autogenerate.roleauthInterceptor.RoleControl;
import pers.fhr.autogenerate.service.IUserDeal;

@Controller
public class UserController {
	@Autowired
	private IUserDeal userDeal;
	public void setUserDeal(IUserDeal userDeal){
		this.userDeal=userDeal;
	}
	@RequestMapping("/logoing")
	public ModelAndView loging(String userName,String userID,HttpSession session){
		if(userName==null||userID==null){
			return new ModelAndView("logoing","msg","");
		}
		Person person=userDeal.logoing(Long.parseLong(userID), userName);
		if(person==null){
			return new ModelAndView("logoing","msg","账号或者密码错误");
		}
		//保存用户信息
		session.setAttribute("user",person);
		return new ModelAndView("redirect:/index","user",person);
	}
	@RoleControl(roles={"user","admin"})
	@RequestMapping("/detail")
	public ModelAndView Detail(HttpSession session){
		/*从会话当中获取用户信息*/
		Person user=(Person) session.getAttribute("user");
		return new ModelAndView("detail","user",user);
	}
	@RoleControl(roles={"user","admin"})
	@RequestMapping("/exit")
	public ModelAndView exit(HttpSession session){
		//删除Session会话中的用户信息
		session.removeAttribute("user");
		return new ModelAndView("redirect:/logoing","msg","");
	}
}
