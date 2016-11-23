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
	@RequestMapping(value="/examclass",//请求路径
					method=RequestMethod.GET,//请求方法
					produces=MediaType.APPLICATION_JSON_VALUE)//produces表示类或者方法返回的MIME数据类型
	public List<Examclass> findAll(Model model){
		//model.addAttribute("examclass", examclassService.findAll());
		//return "jsontemplate";
		return examclassService.findAll();
	}
	@ResponseBody
	@RequestMapping(value="/examclass/{id}}",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Examclass findOne(@PathVariable Integer id){
		return examclassService.findById(id);
	}
	@ResponseBody
	@RequestMapping(value="/examclass",
					method=RequestMethod.POST,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Examclass create(@RequestBody Examclass examclass){
		return examclassService.create(examclass);
	}
	@ResponseBody
	@RequestMapping(value="/examclass",
					method=RequestMethod.PUT,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Examclass update(@RequestBody Examclass examclass){
		return examclassService.update(examclass);
	}
	@ResponseBody
	@RequestMapping(value="/examclass/{id}",
					method=RequestMethod.DELETE,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable Integer id){
		 examclassService.delete(examclassService.findById(id));
	}
}
