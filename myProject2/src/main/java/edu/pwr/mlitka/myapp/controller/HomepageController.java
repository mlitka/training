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

@Controller
public class HomepageController {

	//
	@Autowired
	SessionService sessionService;
	//

	@RequestMapping("/")
	public String index(final Model model, final HttpSession httpSession) {
		final User loggedUser = this.sessionService.getLoggedUser(httpSession);
		model.addAttribute("username", loggedUser.getUsername());
		return "homepage";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String index(final Model model, @RequestParam final String part1, @RequestParam final String part2) {
		model.addAttribute("part1", part1);
		model.addAttribute("part2", part2);
		return "homepage";
	}

}
