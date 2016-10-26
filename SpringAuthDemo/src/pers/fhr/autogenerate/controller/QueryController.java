package pers.fhr.autogenerate.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pers.fhr.autogenerate.entity.Examclass;
import pers.fhr.autogenerate.entity.Person;
import pers.fhr.autogenerate.roleauthInterceptor.RoleControl;
import pers.fhr.autogenerate.service.IQuerySomething;
/**
 * 查询控制器
 * @author FHR
 */
@Controller
public class QueryController {
	@Autowired
	private IQuerySomething querySomething;
 
	public void setQuerySomething(IQuerySomething querySomething){
		this.querySomething=querySomething;
	}
	@RoleControl(roles={"admin","user"})
	@RequestMapping("/query")
	public ModelAndView getExams(HttpSession session){
		try {
		Person user=(Person)session.getAttribute("user");
		if(user.getPersonId()==1)
		{
			List<Examclass> examClasss= querySomething.queryExams();
			return new ModelAndView("adminquery","examClasss",examClasss);
		}
		else {
			return getExamStudent(user.getExamclass().getExamClassId());
		}
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return null;
		}
		
	}
	@RoleControl(roles={"user","admin"})
	@RequestMapping(value="/querys/examstudent/{examid}")
	public ModelAndView getExamStudent(@PathVariable int examid){
		Set<Person> persons=querySomething.queryExamPersons(examid);
		return new ModelAndView("examstu","persons",persons);
	}
	
}
