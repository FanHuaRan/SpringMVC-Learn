package pers.fhr.restdemo.services;

import java.util.List;
/**
 * 基础实体服务接口
 * @author FHR
 * @time 2016/11/25
 */
public interface IBaseEntityService<T> {
	T findById(Integer id);
	List<T> findAll();
	T save(T object);
	T update(T object);
	T create(T object);
	void delete(T object);
}
