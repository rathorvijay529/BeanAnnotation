package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.model.Collage;
import com.model.Student;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:student.properties")
public class Configuration {
	@Bean(name="college")
	public Collage collage() {
		return new Collage();
	}

	@Bean(name= {"studentBean","studentAlternateName", "studentSecondName"})
	public Student student() {
		Student student = new Student();
		student.setCollage(collage());
		return student;
	}

}