package pers.fhr.autogenerate.entity;

import java.util.Set;

/**
 * Persontype entity. @author MyEclipse Persistence Tools
 */
public class Persontype extends AbstractPersontype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Persontype() {
	}

	/** minimal constructor */
	public Persontype(Short personTypeId) {
		super(personTypeId);
	}

	/** full constructor */
	public Persontype(Short personTypeId, String personTypeName, Set persons) {
		super(personTypeId, personTypeName, persons);
	}

}
