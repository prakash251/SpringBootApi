package com.Spring.SpringDatabaseProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringDatabaseProject.dao.StudentDao;
import com.Spring.SpringDatabaseProject.entity.Studentapi;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api")
public class StudentController
{

	StudentDao sd;
	@Autowired
	public StudentController(StudentDao sd)
	{
		super();
		this.sd = sd;
	}

	@GetMapping("/student")
	public List<Studentapi> studentDisplay()
	{
		return sd.StudentDisplay();
	}

	@GetMapping("/id/{id}")
	 public Studentapi getOneStudent(@PathVariable int id)
	{
		 
		return sd.getOneStudent(id) ;
		
	}
	
	@Transactional
	@GetMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		sd.deleteStudent(id);

	}
}
