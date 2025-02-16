package com.infy.dao;

import com.infy.entity.StudentEntity;

public class DataBaseConnection {
	
	public void saveToDB(StudentEntity entity){
	System.out.println("Saved DB succesfully :" +entity);
	}
	
	public StudentEntity getFromDB(int id){
	System.out.println("calling DB");
	return new StudentEntity(id, "neha", "pune");
	}

}
