package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.service.TeacherServiceImpl;

@SpringBootApplication
public class TeacherCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context = SpringApplication.run(TeacherCrudApplication.class, args);
		
		TeacherService ts = context.getBean(TeacherServiceImpl.class);
		
		ts.add(new Teacher(115, "Sunny" ,"CS", "Math", 50000));
		ts.add(new Teacher(116, "Pratik" ,"cs", "Science", 40000));
		ts.add(new Teacher(117, "Vaibhav" ,"CS", "Maths", 20000));
		ts.add(new Teacher(118, "Niraj" ,"CS", "DSA", 40000));
		
		System.out.println(ts.display());
	}

}
