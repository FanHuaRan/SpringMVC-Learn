package pers.fhr.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.fhr.restdemo.entity.Persontype;
import pers.fhr.restdemo.services.IPersontypeService;
/**
 * 人员类型Rest控制器
 * @author FHR
 * @time 2016/11/25
 */
@Controller
public class PersonTypeRestController {
	private IPersontypeService persontypeService;
	@Autowired
	public void setPersontypeService(IPersontypeService persontypeService){
		this.persontypeService=persontypeService;
	}
	@ResponseBody 
	@RequestMapping(value="/persontype",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Persontype> findAll(Model model){
		//model.addAttribute("examclass", examclassService.findAll());
		//return "jsontemplate";
		List<Persontype> persontypess= persontypeService.findAll();
		return persontypess;
	}
	
	@ResponseBody 
	@RequestMapping(value="/persontype/{id}",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Persontype findById(@PathVariable Integer id){
		return persontypeService.findById(id);
	}
	@ResponseBody
	@RequestMapping(value="/persontype",
					method=RequestMethod.POST,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Persontype create(@RequestBody Persontype persontype){
		return persontypeService.create(persontype);
	}
	@ResponseBody
	@RequestMapping(value="/persontype",
					method=RequestMethod.PUT,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Persontype update(@RequestBody Persontype persontype){
		return persontypeService.update(persontype);
	}
	@ResponseBody
	@RequestMapping(value="/persontype/{id}",
					method=RequestMethod.DELETE,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Persontype persontype){
		persontypeService.delete(persontypeService.findById(persontype.getPersonTypeId().intValue()));
	}
}
