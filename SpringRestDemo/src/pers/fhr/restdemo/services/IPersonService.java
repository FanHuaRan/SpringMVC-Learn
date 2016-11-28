package pers.fhr.restdemo.services;

import pers.fhr.restdemo.entity.Person;

/**
 * 人员服务接口
 * @author FHR
 * @time 2016/11/25
 */
public interface IPersonService extends IBaseEntityService<Person>{
	Person findByName(String name);
}
