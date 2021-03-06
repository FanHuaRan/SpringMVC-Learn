package pers.fhr.restdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.fhr.restdemo.dao.PersontypeDAO;
import pers.fhr.restdemo.entity.Persontype;
import pers.fhr.restdemo.services.IPersontypeService;
/**
 * 人员类型服务类
 * @author FHR
 * @time 2016/11/25
 */
@Service
public class PersontypeServiceImpl implements IPersontypeService {
	private PersontypeDAO persontypeDAO;
	@Autowired
	public void setPersontypeDao(PersontypeDAO persontypeDAO){
		this.persontypeDAO=persontypeDAO;
	}
	@Override
	public Persontype findById(Integer id) {
		return persontypeDAO.findById(id.shortValue());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Persontype> findAll() {
		return persontypeDAO.findAll();
	}
	
	@Override
	public Persontype save(Persontype object) {
		return findById(persontypeDAO.save(object));
	}

	@Override
	public Persontype update(Persontype object) {
		Persontype persontype=persontypeDAO.findById(object.getPersonTypeId());
		if(persontype==null){
			throw new IllegalStateException("no.exists");
		}
		return save(object);
	}

	@Override
	public Persontype create(Persontype object) {
		Persontype persontype=persontypeDAO.findById(object.getPersonTypeId());
		if(persontype!=null){
			throw new IllegalStateException("already.exists");
		}
		return save(object);
	}

	@Override
	public void delete(Persontype object) {
		persontypeDAO.delete(object);
	}
}
