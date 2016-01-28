package me.gacl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("itemController")
@RequestMapping("item")
public class ItemController {

	@RequestMapping(value = "swit.do")
	public ModelAndView swit() {
		return new ModelAndView("first");
	}
}
