package edu.pwr.mlitka.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pwr.mlitka.myapp.service.SessionService;
import edu.pwr.mlitka.myapp.service.UserService;

@Controller
public class LogoutController {

	@Autowired
	UserService userService;
	@Autowired
	SessionService sessionService;

	@RequestMapping(value = "/logout")
	String logout(final HttpSession httpSession) {

		userService.deleteUser(sessionService.getLoggedUser(httpSession));
		this.sessionService.logOutUser(httpSession);
		return "logout";
	}

}
