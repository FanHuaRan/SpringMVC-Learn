package pers.fhr.autogenerate.entity;


/**
 * Person entity. @author MyEclipse Persistence Tools
 */
public class Person extends AbstractPerson implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(Long personId) {
		super(personId);
	}

	/** full constructor */
	public Person(Long personId, Persontype persontype, Examclass examclass,
			String personName, Integer age,String password) {
		super(personId, persontype, examclass, personName, age,password);
	}

}
