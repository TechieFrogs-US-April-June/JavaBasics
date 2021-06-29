package org.demo.controller;

import org.demo.entity.Person;
import org.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/addPerson")
	public Person addPerson(@RequestBody Person person) {
		return service.savePerson(person);
	}
	

}
