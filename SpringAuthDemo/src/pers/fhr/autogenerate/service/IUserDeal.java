package pers.fhr.autogenerate.service;

import pers.fhr.autogenerate.entity.Person;

public interface IUserDeal {
	Person logoing(String password,Long userId);
}
