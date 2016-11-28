package pers.fhr.restdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.fhr.restdemo.dao.PersonDAO;
import pers.fhr.restdemo.entity.Person;
import pers.fhr.restdemo.services.IPersonService;
/**
 * 人员服务类
 * @author FHR
 * @time 2016/11/25
 */
@Service
public class PersonServiceImpl implements IPersonService {
	private PersonDAO personDAO;
	@Autowired
	public void setPersonDao(PersonDAO personDAO){
		this.personDAO=personDAO;
	}
	@Override
	public Person findById(Integer id) {
		return personDAO.findById(new Long(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> findAll() {
		return personDAO.findAll();
	}
	
	@Override
	public Person save(Person object) {
		return findById(personDAO.save(object));
	}

	@Override
	public Person update(Person object) {
		Person person=personDAO.findById(object.getPersonId());
		if(person==null){
			throw new IllegalStateException("no.exists");
		}
		return save(object);
	}

	@Override
	public Person create(Person object) {
		Person person=personDAO.findById(object.getPersonId());
		if(person!=null){
			throw new IllegalStateException("already.exists");
		}
		return save(object);
	}

	@Override
	public void delete(Person object) {
		personDAO.delete(object);
	}
	@Override
	public Person findByName(String name) {
		return (Person) personDAO.findByPersonName(name);
	}

}
