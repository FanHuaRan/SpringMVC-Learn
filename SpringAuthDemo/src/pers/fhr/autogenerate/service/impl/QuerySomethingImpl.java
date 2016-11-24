package pers.fhr.autogenerate.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.fhr.autogenerate.entity.Examclass;
import pers.fhr.autogenerate.entity.Person;
import pers.fhr.autogenerate.entitydao.ExamclassDAO;
import pers.fhr.autogenerate.service.IQuerySomething;
@Service
public class QuerySomethingImpl implements IQuerySomething{
	@Autowired
	private ExamclassDAO examclassDAO;
	public void setExamclassDAO(ExamclassDAO dao){
		this.examclassDAO=dao;
	}
	public QuerySomethingImpl(){
		//this.examclassDAO=new ExamclassDAO();
	}
	public List<Examclass> queryExams() {
		List<Examclass> examclasses=examclassDAO.findAll();
		return examclasses;
	}

	public Set<Person> queryExamPersons(int examID) {
		// TODO Auto-generated method stub
		Examclass examclass=examclassDAO.findById(examID);
		if(examclass!=null){
			return examclass.getPersons();
		}
		else {
			return null;
		}
	}
	
}
