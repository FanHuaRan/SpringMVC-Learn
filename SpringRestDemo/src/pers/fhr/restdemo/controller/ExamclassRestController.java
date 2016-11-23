package pers.fhr.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import pers.fhr.restdemo.entity.Examclass;
import pers.fhr.restdemo.services.IExamclassService;

@Controller
public class ExamclassRestController {
	private IExamclassService examclassService;
	@Autowired
	public void setExamclassService(IExamclassService examclassService){
		this.examclassService=examclassService;
	}
	@ResponseBody 
	@RequestMapping(value="/examclass",
					method=RequestMethod.GET)
	public List<Examclass> findAll(Model model){
		//model.addAttribute("examclass", examclassService.findAll());
		//return "jsontemplate";
		return examclassService.findAll();
	}
	
}
