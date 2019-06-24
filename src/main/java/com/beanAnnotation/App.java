package com.beanAnnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Configuration;
import com.model.Student;

/**
 * @author vbopche
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
    	Student stu= context.getBean("studentSecondName", Student.class);
    	System.out.println(stu);
    	
    }
}
