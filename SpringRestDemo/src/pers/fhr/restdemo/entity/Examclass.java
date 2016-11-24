package pers.fhr.restdemo.entity;

import java.util.Set;

/**
 * Examclass entity. @author MyEclipse Persistence Tools
 */
public class Examclass extends AbstractExamclass implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Examclass() {
	}

	/** minimal constructor */
	public Examclass(Integer examClassId) {
		super(examClassId);
	}

	/** full constructor */
	public Examclass(Integer examClassId, String examClassName, Set persons) {
		super(examClassId, examClassName);
	}

}
