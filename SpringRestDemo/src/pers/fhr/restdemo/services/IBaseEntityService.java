package pers.fhr.restdemo.services;

import java.util.List;

public interface IBaseEntityService<T> {
	T findById(Integer id);
	List<T> findAll();
	T save(T object);
	T update(T object);
	T create(T object);
	void delete(T object);
}
