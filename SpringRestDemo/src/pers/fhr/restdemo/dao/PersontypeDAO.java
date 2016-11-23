package pers.fhr.restdemo.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pers.fhr.restdemo.entity.Persontype;

/**
 * A data access object (DAO) providing persistence and search support for
 * Persontype entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see pers.fhr.restdemo.entity.Persontype
 * @author MyEclipse Persistence Tools
 */
@Repository
public class PersontypeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(PersontypeDAO.class);
	// property constants
	public static final String PERSON_TYPE_NAME = "personTypeName";

	public Integer save(Persontype transientInstance) {
		log.debug("saving Persontype instance");
		try {
			Integer key=(Integer)getSession().save(transientInstance);
			log.debug("save successful");
			return key;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Persontype persistentInstance) {
		log.debug("deleting Persontype instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Persontype findById(java.lang.Short id) {
		log.debug("getting Persontype instance with id: " + id);
		try {
			Persontype instance = (Persontype) getSession().get(
					"pers.fhr.restdemo.entity.Persontype", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Persontype instance) {
		log.debug("finding Persontype instance by example");
		try {
			List results = getSession()
					.createCriteria("pers.fhr.restdemo.entity.Persontype")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Persontype instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Persontype as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPersonTypeName(Object personTypeName) {
		return findByProperty(PERSON_TYPE_NAME, personTypeName);
	}

	public List findAll() {
		log.debug("finding all Persontype instances");
		try {
			String queryString = "from Persontype";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Persontype merge(Persontype detachedInstance) {
		log.debug("merging Persontype instance");
		try {
			Persontype result = (Persontype) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Persontype instance) {
		log.debug("attaching dirty Persontype instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Persontype instance) {
		log.debug("attaching clean Persontype instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}