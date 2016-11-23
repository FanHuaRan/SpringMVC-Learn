package pers.fhr.restdemo.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPersontype entity provides the base persistence definition of the
 * Persontype entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPersontype implements java.io.Serializable {

	// Fields

	private Short personTypeId;
	private String personTypeName;
	private Set persons = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPersontype() {
	}

	/** minimal constructor */
	public AbstractPersontype(Short personTypeId) {
		this.personTypeId = personTypeId;
	}

	/** full constructor */
	public AbstractPersontype(Short personTypeId, String personTypeName,
			Set persons) {
		this.personTypeId = personTypeId;
		this.personTypeName = personTypeName;
		this.persons = persons;
	}

	// Property accessors

	public Short getPersonTypeId() {
		return this.personTypeId;
	}

	public void setPersonTypeId(Short personTypeId) {
		this.personTypeId = personTypeId;
	}

	public String getPersonTypeName() {
		return this.personTypeName;
	}

	public void setPersonTypeName(String personTypeName) {
		this.personTypeName = personTypeName;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

}