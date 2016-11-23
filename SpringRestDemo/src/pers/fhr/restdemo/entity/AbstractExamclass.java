package pers.fhr.restdemo.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractExamclass entity provides the base persistence definition of the
 * Examclass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExamclass implements java.io.Serializable {

	// Fields

	private Integer examClassId;
	private String examClassName;
	private Set persons = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractExamclass() {
	}

	/** minimal constructor */
	public AbstractExamclass(Integer examClassId) {
		this.examClassId = examClassId;
	}

	/** full constructor */
	public AbstractExamclass(Integer examClassId, String examClassName,
			Set persons) {
		this.examClassId = examClassId;
		this.examClassName = examClassName;
		this.persons = persons;
	}

	// Property accessors

	public Integer getExamClassId() {
		return this.examClassId;
	}

	public void setExamClassId(Integer examClassId) {
		this.examClassId = examClassId;
	}

	public String getExamClassName() {
		return this.examClassName;
	}

	public void setExamClassName(String examClassName) {
		this.examClassName = examClassName;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

}