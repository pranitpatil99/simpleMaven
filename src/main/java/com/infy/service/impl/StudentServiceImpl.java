package com.infy.service.impl;

import com.infy.bean.Student;
import com.infy.dao.DataBaseConnection;
import com.infy.entity.StudentEntity;
import com.infy.service.StudentService;

public class StudentServiceImpl implements StudentService {

	// manually created and injected databaseConnection bean
	private DataBaseConnection dataBaseConnection = new DataBaseConnection(); 

	public void save(Student sbean) {
		StudentEntity entity = new StudentEntity();
		try {
			entity.setEnId(sbean.getId());
			entity.setEnName(sbean.getName());
			entity.setEnAddress(sbean.getAddress());
			dataBaseConnection.saveToDB(entity);

		} catch (Exception e) {
			System.err.println("Failed to save student");
		}

	}

	public Student getStudent(int id) {
		System.out.println("Fetch student with id " + id);
		StudentEntity entity = dataBaseConnection.getFromDB(id);
		Student bean = new Student();
		bean.setId(entity.getEnId());
		bean.setName(entity.getEnName());
		bean.setAddress(entity.getEnAddress());
		return bean;
	}

}
