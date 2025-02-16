package com.infy.demo;

import com.infy.bean.Student;
import com.infy.service.StudentService;
import com.infy.service.impl.StudentServiceImpl;

public class StudentTesting 
{
    public static void main( String[] args )
    {
        Student sbean = new Student(101, "nikita", "karad"); 
        StudentService studService = new StudentServiceImpl(); // manually created service bean
        studService.save(sbean);
        
        Student stBean = studService.getStudent(102);
        System.out.println("Retrived student :: "+ stBean);
    }
}
