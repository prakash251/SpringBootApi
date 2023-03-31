package com.Spring.SpringDatabaseProject.dao;

import java.util.List;

import com.Spring.SpringDatabaseProject.entity.Studentapi;

public interface StudentDaoMethods 
{
	 public List<Studentapi> StudentDisplay();
	 public Studentapi getOneStudent(int id);
	 public void deleteStudent(int id);
	
}
