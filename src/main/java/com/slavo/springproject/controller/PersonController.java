package com.slavo.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.slavo.springproject.dao.PersonDAO;
import com.slavo.springproject.human.Person;

@Controller
public class PersonController {
	private final String HOME_PAGE = "home";
	private final String GET_HUMAN = "showPerson";
	
	@Autowired
	PersonDAO humandao;
	
	@RequestMapping("/")
	public String home() {
		return HOME_PAGE;
	}
	
	@RequestMapping("/addPerson") 
	public String addPerson(Person human){
		humandao.save(human);
		return HOME_PAGE;
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam String searchParam) {
		ModelAndView mnv = new ModelAndView(GET_HUMAN);
		if(checkIfNumericalString(searchParam)) {
			Person person = humandao.findById(Integer.parseInt(searchParam)).orElse(new Person());
			mnv.addObject(person);
			System.out.println("executing search by ID: " + searchParam);
			System.out.println(person);
		} else {
			List<Person> person = humandao.findByNameOrSurnameLike(searchParam, searchParam);
			mnv.addObject("list",person);
			System.out.println("executing search by Name or Surname: " + searchParam);
			System.out.println(person);
		}
		return mnv;
	}
	
	private boolean checkIfNumericalString(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	

}
