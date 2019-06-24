package com.model;

public class Collage {
	private String collage;
	private String university;

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Collage [collage=" + collage + ", university=" + university + "]";
	}

}
