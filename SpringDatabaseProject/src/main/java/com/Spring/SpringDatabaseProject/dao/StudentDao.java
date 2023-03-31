package com.Spring.SpringDatabaseProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.SpringDatabaseProject.entity.Studentapi;

import jakarta.persistence.EntityManager;


@Repository
public class StudentDao implements StudentDaoMethods
{
	EntityManager eman;	
	@Autowired
	public StudentDao(EntityManager eman) 
	{
		super();
		this.eman = eman;
	}

	@Override
	public List<Studentapi> StudentDisplay() 
	{

		Session ses=eman.unwrap(Session.class);
		Query query=ses.createQuery("from Studentapi",Studentapi.class);
		List<Studentapi> lst=query.getResultList();  
		return lst;
	}

	@Override
	public Studentapi getOneStudent(int id) 
	{
		Session ss=eman.unwrap(Session.class);
		
		Studentapi s=ss.get(Studentapi.class,id);
		return s;
	}

	@Override
	public void deleteStudent(int id)
	{
	 Session ss=eman.unwrap(Session.class);
	  Query<Studentapi> query=ss.createQuery("delete from Studentapi where id="+id);
	  query.executeUpdate();
		
	}


}

