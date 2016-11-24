package pers.fhr.autogenerate.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.fhr.autogenerate.entity.Person;
import pers.fhr.autogenerate.entitydao.PersonDAO;
import pers.fhr.autogenerate.service.IUserDeal;
@Service
public class UserDealImpl implements IUserDeal {
	@Autowired
	private PersonDAO personDAO; 
	public void setPersonDAO(PersonDAO dao){
		this.personDAO=personDAO;
	}
	public UserDealImpl(){
		//personDAO=new PersonDAO();
	}
	public Person logoing(Long userID, String userName) {
		Person person= personDAO.findById(userID);
		if(person==null||!person.getPersonName().equals(userName)){
			return null;
		}
		return person;
	}

}
