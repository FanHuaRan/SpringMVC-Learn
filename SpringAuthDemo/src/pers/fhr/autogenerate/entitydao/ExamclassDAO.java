package pers.fhr.autogenerate.entitydao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pers.fhr.autogenerate.entity.Examclass;

/**
 * A data access object (DAO) providing persistence and search support for
 * Examclass entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see pers.fhr.autogenerate.entity.Examclass
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ExamclassDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ExamclassDAO.class);
	// property constants
	public static final String EXAM_CLASS_NAME = "examClassName";

	public void save(Examclass transientInstance) {
		log.debug("saving Examclass instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Examclass persistentInstance) {
		log.debug("deleting Examclass instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Examclass findById(java.lang.Integer id) {
		log.debug("getting Examclass instance with id: " + id);
		try {
			Examclass instance = (Examclass) getSession().get("pers.fhr.autogenerate.entity.Examclass",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Examclass instance) {
		log.debug("finding Examclass instance by example");
		try {
			List results = getSession().createCriteria("pers.fhr.autogenerate.entity.Examclass")
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
		log.debug("finding Examclass instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Examclass as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExamClassName(Object examClassName) {
		return findByProperty(EXAM_CLASS_NAME, examClassName);
	}

	public List findAll() {
		log.debug("finding all Examclass instances");
		try {
			String queryString = "from Examclass";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Examclass merge(Examclass detachedInstance) {
		log.debug("merging Examclass instance");
		try {
			Examclass result = (Examclass) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Examclass instance) {
		log.debug("attaching dirty Examclass instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Examclass instance) {
		log.debug("attaching clean Examclass instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}