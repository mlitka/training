package edu.pwr.mlitka.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pwr.mlitka.myapp.model.User;
import edu.pwr.mlitka.myapp.service.SessionService;

@Controller
public class HomepageController {

	//
	@Autowired
	SessionService sessionService;
	//

	@RequestMapping("/")
	public String index(final Model model, final HttpSession httpSession) {
		final boolean isUserLogged = this.sessionService.isAnyUserLogged(httpSession);
		if (isUserLogged) {
			final User loggedUser = this.sessionService.getLoggedUser(httpSession);
			model.addAttribute("username", loggedUser.getUsername());
		}
		return isUserLogged ? "homepage" : "redirect:/login";
	}

}
