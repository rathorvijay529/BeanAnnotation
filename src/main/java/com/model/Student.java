package com.model;

public class Student {
	//@Value("${student.rollnumber}")
	private String rollno;
	//@Value("${student.name}")
	private String name;
	//@Value("${student.hobby}")
	private String hobby;
    
	private Collage collage;

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", hobby=" + hobby + ", collage=" + collage + "]";
	}

}
