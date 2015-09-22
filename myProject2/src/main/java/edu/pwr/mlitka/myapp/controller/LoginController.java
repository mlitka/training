package edu.pwr.mlitka.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.pwr.mlitka.myapp.model.User;
import edu.pwr.mlitka.myapp.service.SessionService;
import edu.pwr.mlitka.myapp.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	@Autowired
	SessionService sessionService;

	@RequestMapping(value = "/login")
	String login(final Model model) {
		model.addAttribute("loginFailed", false);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	String login(final Model model, @RequestParam final String username, @RequestParam final String password,
			final HttpSession httpSession) {

		final User usr = this.userService.findByUsername(username.toLowerCase());
		final boolean loggedOK = usr != null && password.equals(usr.getPassword());
		if (loggedOK) {
			this.sessionService.setLoggedUser(httpSession, usr);
		}
		model.addAttribute("loginFailed", !loggedOK);
		return loggedOK ? "redirect:/" : "login";
	}

}
