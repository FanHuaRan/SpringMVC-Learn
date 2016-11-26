package pers.fhr.autogenerate.entity;


/**
 * AbstractPerson entity provides the base persistence definition of the Person
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPerson implements java.io.Serializable {

	// Fields

	private Long personId;
	private Persontype persontype;
	private Examclass examclass;
	private String personName;
	private Integer age;
	private String password;
	// Constructors

	/** default constructor */
	public AbstractPerson() {
	}

	/** minimal constructor */
	public AbstractPerson(Long personId) {
		this.personId = personId;
	}

	/** full constructor */
	public AbstractPerson(Long personId, Persontype persontype,
			Examclass examclass, String personName, Integer age,String password) {
		this.personId = personId;
		this.persontype = persontype;
		this.examclass = examclass;
		this.personName = personName;
		this.age = age;
		this.password=password;
	}

	// Property accessors

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Persontype getPersontype() {
		return this.persontype;
	}

	public void setPersontype(Persontype persontype) {
		this.persontype = persontype;
	}

	public Examclass getExamclass() {
		return this.examclass;
	}

	public void setExamclass(Examclass examclass) {
		this.examclass = examclass;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
}