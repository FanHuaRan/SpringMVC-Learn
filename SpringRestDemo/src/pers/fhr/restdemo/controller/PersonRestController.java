package pers.fhr.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.fhr.restdemo.entity.Examclass;
import pers.fhr.restdemo.entity.Person;
import pers.fhr.restdemo.services.IExamclassService;
import pers.fhr.restdemo.services.IPersonService;

@Controller
public class PersonRestController {
	private IPersonService personService;
	@Autowired
	public void setPersonService(IPersonService personService){
		this.personService=personService;
	}
	@ResponseBody 
	@RequestMapping(value="/person",
					method=RequestMethod.GET)
	public List<Person> findAll(Model model){
		//model.addAttribute("examclass", examclassService.findAll());
		//return "jsontemplate";
		return personService.findAll();
	}
	/*
	@ResponseBody 
	@RequestMapping(value="/person",
					method=RequestMethod.GET)
	public List<Person> findById(Model model){
		//model.addAttribute("examclass", examclassService.findAll());
		//return "jsontemplate";
		return personService.findAll();
	}
	*/
}
