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

	// Constructors

	/** default constructor */
	public AbstractPersontype() {
	}

	/** minimal constructor */
	public AbstractPersontype(Short personTypeId) {
		this.personTypeId = personTypeId;
	}

	/** full constructor */
	public AbstractPersontype(Short personTypeId, String personTypeName) {
		this.personTypeId = personTypeId;
		this.personTypeName = personTypeName;
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

}