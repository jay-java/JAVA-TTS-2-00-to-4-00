package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.model.User;

public class UserDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void insertOrUpdateUser(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}

	public User getUserBydId(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}

	public List<User> getAllUsers() {
		return this.hibernateTemplate.loadAll(User.class);
	}

	@Transactional
	public void deleteUser(int id) {
		User u = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(u);
	}

}
