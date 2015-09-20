package edu.pwr.mlitka.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import edu.pwr.mlitka.myapp.dao.UserDAO;
import edu.pwr.mlitka.myapp.model.User;

public class UserService {

	@Autowired
	private UserDAO userDao;

	@Transactional
	public User findByUsername(final String username) {
		return this.userDao.findByUsername(username);
	}

	@Transactional
	public User findById(int user_id) {
		return this.userDao.findById(user_id);
	}

	@Transactional
	public void save(User user) {
		this.userDao.save(user);
	}

	@Transactional
	public List<User> findAll() {
		return this.userDao.allUsers();
	}

	@Transactional
	public void deleteUser(User user) {
		this.userDao.delete(user);
	}

	@Transactional
	public void deleteById(int user_id) {
		this.userDao.delete(user_id);
	}
}
