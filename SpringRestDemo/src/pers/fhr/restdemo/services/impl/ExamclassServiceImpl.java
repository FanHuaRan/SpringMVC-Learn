package pers.fhr.restdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.fhr.restdemo.dao.ExamclassDAO;
import pers.fhr.restdemo.entity.Examclass;
import pers.fhr.restdemo.services.IExamclassService;
/**
 * 班级服务类
 * @author FHR
 * @time 2016/11/25
 */
@Service
public class ExamclassServiceImpl implements IExamclassService {
	private ExamclassDAO examclassDAO;
	@Autowired
	public void setExamclassDao(ExamclassDAO examclassDAO){
		this.examclassDAO=examclassDAO;
	}
	@Override
	public Examclass findById(Integer id) {
		return examclassDAO.findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Examclass> findAll() {
		return examclassDAO.findAll();
	}

	@Override
	public Examclass save(Examclass object) {
		return findById(examclassDAO.save(object));
	}

	@Override
	public Examclass update(Examclass object) {
		Examclass examclass=examclassDAO.findById(object.getExamClassId());
		if(examclass==null){
			throw new IllegalStateException("no.exists");
		}
		return save(object);
	}

	@Override
	public Examclass create(Examclass object) {
		Examclass examclass=examclassDAO.findById(object.getExamClassId());
		if(examclass!=null){
			throw new IllegalStateException("already.exists");
		}
		return save(object);
	}

	@Override
	public void delete(Examclass object) {
		// TODO Auto-generated method stub
		
	}

}
