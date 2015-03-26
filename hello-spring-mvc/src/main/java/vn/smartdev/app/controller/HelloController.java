package vn.smartdev.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("message", "Hello " + name);
		
		return "hello";
	}

}
