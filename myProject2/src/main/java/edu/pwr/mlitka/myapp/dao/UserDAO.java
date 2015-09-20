package edu.pwr.mlitka.myapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pwr.mlitka.myapp.model.User;

@Repository
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(final User user) {
		final Session currentSession = this.sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(user);
	}

	public User findById(int user_id) {
		return (User) this.sessionFactory.getCurrentSession().get(User.class, user_id);

	}

	public User findByUsername(String username) {
		return (User) this.sessionFactory.getCurrentSession().createCriteria(User.class)
				.add(Restrictions.like("username", username)).uniqueResult();
	}

	public List<User> allUsers() {
		return this.sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	public void delete(User user) {
		this.sessionFactory.getCurrentSession().delete(user);
	}

	public void delete(int user_id) {
		this.sessionFactory.getCurrentSession().delete(findById(user_id));
	}

}
