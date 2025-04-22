package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepo;

@Service
public class TeacherServiceImpl  implements TeacherService{

	@Autowired
	private TeacherRepo tr;
	
	
	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		tr.save(teacher);
		
	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}


	
	
}
