package edu.pwr.mlitka.myapp.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import edu.pwr.mlitka.myapp.model.User;

@Service
public class SessionService {

	private static final String LOGGED_USER_ATTRIBUTE_NAME = "loggedUser";

	public void setLoggedUser(final HttpSession session, final User user) {
		session.setAttribute(SessionService.LOGGED_USER_ATTRIBUTE_NAME, user);
	}

	public User getLoggedUser(final HttpSession session) {

		return (User) session.getAttribute(LOGGED_USER_ATTRIBUTE_NAME);
	}

	public void logOutUser(final HttpSession session) {
		session.removeAttribute(LOGGED_USER_ATTRIBUTE_NAME);
	}

	public boolean isAnyUserLogged(final HttpSession session) {
		return getLoggedUser(session) != null;
	}
}
