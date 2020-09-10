package com.slavo.springproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.slavo.springproject.human.Person;

public interface PersonDAO extends CrudRepository<Person, Integer>{
	
	List<Person> findByNameOrSurnameLike(String input, String input2);

}
