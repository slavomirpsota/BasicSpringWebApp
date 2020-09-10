package com.slavo.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.slavo.springproject.dao.HumanDAO;
import com.slavo.springproject.human.Human;

@Controller
public class HumanController {
	private final String HOME_PAGE = "home";
	private final String GET_HUMAN_BY_ID = "showHuman";
	
	@Autowired
	HumanDAO humandao;
	
	@RequestMapping("/")
	public String home() {
		return HOME_PAGE;
	}
	
	@RequestMapping("/addHuman") 
	public String addHuman(Human human){
		humandao.save(human);
		return HOME_PAGE;
	}
	
	@RequestMapping("/getHumanById")
	public ModelAndView getHumanById(@RequestParam int hid) {
		ModelAndView mnv = new ModelAndView(GET_HUMAN_BY_ID);
		Human human = humandao.findById(hid).orElse(new Human());
		mnv.addObject(human);
		return mnv;
	}

}
