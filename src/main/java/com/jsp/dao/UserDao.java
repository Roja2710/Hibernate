package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("roja");
	public User saveUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if(user != null) {
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();	
		}
		return user;
		}
	public User updateUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1 = entityManager.find(User.class, user.getId());
		if(user1 != null) {
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
		}
		return user1;
	} 
	
		public User deleteUser(int id) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			User user = entityManager.find(User.class, id);
			if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			}
			return user;
			}
			public User getUserById(int id) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			return entityManager.find(User.class, id);
			}
			public List<User> getAllUser() {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			Query query = entityManager.createQuery("select a from User a");
			return query.getResultList();
			}
			public User loginData(String email, String password) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			Query query = entityManager.createQuery("select a from User a where email=?1 and password=?2");
			query.setParameter(1, email);
			query.setParameter(2, password);
			List<User> list = query.getResultList();
			if (list.size() > 0) {
			return list.get(0);
			}
			return null;	
	}
}
