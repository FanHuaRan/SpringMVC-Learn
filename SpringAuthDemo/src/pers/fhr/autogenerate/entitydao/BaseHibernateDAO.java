package pers.fhr.autogenerate.entitydao;

import org.hibernate.Session;
import pers.fhr.autogenerate.hibernate.HibernateSessionFactory;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}