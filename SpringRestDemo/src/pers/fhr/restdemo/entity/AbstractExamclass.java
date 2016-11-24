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


	// Constructors

	/** default constructor */
	public AbstractExamclass() {
	}

	/** minimal constructor */
	public AbstractExamclass(Integer examClassId) {
		this.examClassId = examClassId;
	}

	/** full constructor */
	public AbstractExamclass(Integer examClassId, String examClassName) {
		this.examClassId = examClassId;
		this.examClassName = examClassName;
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

}