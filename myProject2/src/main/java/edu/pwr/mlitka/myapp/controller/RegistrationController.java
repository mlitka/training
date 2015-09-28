package edu.pwr.mlitka.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.pwr.mlitka.myapp.form.RegisterUserForm;
import edu.pwr.mlitka.myapp.model.User;
import edu.pwr.mlitka.myapp.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/register")
	String register(final Model model) {
		final RegisterUserForm registerUserForm = new RegisterUserForm();
		model.addAttribute("registerUserForm", registerUserForm);
		model.addAttribute("registrationFailed", false);
		return "/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	String save(final Model model, final HttpSession httpSession,
			@ModelAttribute("registerUserForm") final RegisterUserForm registerUserForm) {

		User user = this.userService.findByUsername(registerUserForm.getUsername().toLowerCase());
		final boolean registrationFailed = user != null;
		if (!registrationFailed && user == null) {
			user = new User();
			user.setUsername(registerUserForm.getUsername().toLowerCase());
			user.setName(registerUserForm.getName());
			user.setSurname(registerUserForm.getSurname());
			user.setPassword(registerUserForm.getPassword());
			this.userService.save(user);
		}
		model.addAttribute("registrationFailed", registrationFailed);
		return registrationFailed ? "/register" : "redirect:/login";
	}

}
