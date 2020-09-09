package com.slavo.springproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.slavo.springproject.human.Human;

public interface HumanDAO extends CrudRepository<Human, Integer>{

}
