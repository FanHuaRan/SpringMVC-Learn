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

import pers.fhr.restdemo.entity.Person;
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
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll(Model model){
		//model.addAttribute("examclass", examclassService.findAll());
		//return "jsontemplate";
		List<Person> persons= personService.findAll();
		return persons;
	}
	
	@ResponseBody 
	@RequestMapping(value="/person/{id}",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable Integer id){
		return personService.findById(id);
	}
	@ResponseBody
	@RequestMapping(value="/person",
					method=RequestMethod.POST,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person){
		return personService.create(person);
	}
	@ResponseBody
	@RequestMapping(value="/person",
					method=RequestMethod.PUT,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person){
		return personService.update(person);
	}
	@ResponseBody
	@RequestMapping(value="/person/{id}",
					method=RequestMethod.DELETE,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Person person){
		 personService.delete(personService.findById(person.getPersonId().intValue()));
	}
}
