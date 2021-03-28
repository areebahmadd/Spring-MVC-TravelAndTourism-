package com.virtusa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.model.AdminSignUp;

//Admin Repository Class
@Repository
public class AdminDao implements AdminDaoInterface{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	//Saving signUp details to Database
	@Transactional
	public void signUp(AdminSignUp signUp) {
		this.hibernateTemplate.save(signUp);
	}

	//Fetching added signUp details from Database
	public List<AdminSignUp> getAllAdmin() {
		return(this.hibernateTemplate.loadAll(AdminSignUp.class));
	}

}
