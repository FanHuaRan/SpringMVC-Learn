package pers.fhr.restdemo.services;

import java.util.List;

public abstract  class BaseEntityServiceImpl<T,V> implements IBaseEntityService<T> {
	private V entityDao;
	
	@Override
	public T findById(Integer id) {
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T save(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T create(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T object) {
		// TODO Auto-generated method stub
		
	}
	
}
