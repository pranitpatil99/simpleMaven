package com.infy.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.bean.Student;
import com.infy.service.StudentService;
import com.infy.service.impl.StudentServiceImpl;

public class StudentTesting 
{
    public static void main( String[] args )
    {
        Student sbean = new Student(101, "nikita", "karad");
        StudentService studService = new StudentServiceImpl();
        studService.save(sbean);
        
        Student stBean = studService.getStudent(102);
        System.out.println("Retrived student :: "+ stBean);
    }
}
