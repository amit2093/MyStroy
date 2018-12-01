package com.MyStory.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	int i = 1;
	
	@Autowired
	private PersonService PersonService;
	
	@GetMapping("/savePerson")
    public void create(PersonDto personDto){ 
		personDto.setId(i);
		personDto.setName("Kratika");
		personDto.setEmail("kukkku@gmail.com");
		i++;
		PersonService.create(personDto);
    }
	
	@GetMapping("/getAllPersons")
	public List<Person> getAllPerson() {
		return PersonService.getAllPersons();
	}
}
