package pers.fhr.autogenerate.service;

import java.util.List;
import java.util.Set;

import pers.fhr.autogenerate.entity.Examclass;
import pers.fhr.autogenerate.entity.Person;

public interface IQuerySomething {
	List<Examclass> queryExams();
	Set<Person> queryExamPersons(int examID);
}
