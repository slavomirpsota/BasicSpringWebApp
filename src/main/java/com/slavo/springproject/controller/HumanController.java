package com.slavo.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slavo.springproject.dao.HumanDAO;
import com.slavo.springproject.human.Human;

@Controller
public class HumanController {
	private final String HOME_PAGE = "home";
	
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

}
