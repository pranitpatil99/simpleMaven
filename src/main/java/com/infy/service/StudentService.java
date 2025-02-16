package com.infy.service;

import com.infy.bean.Student;

public interface StudentService {
	
	public void save(Student student);

	public Student getStudent(int id);
}
