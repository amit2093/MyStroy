package com.MyStory.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

	int i = 1;
	
	@Autowired
	private PersonService PersonService;
	
	@GetMapping("/savePerson")
	@CrossOrigin(origins = "http://localhost:4200")
    public void create(PersonDto personDto){ 
		personDto.setId(i);
		personDto.setName("Kratika");
		personDto.setEmail("kukkku@gmail.com");
		i++;
		PersonService.create(personDto);
    }
	
	@GetMapping("/getAllPersons")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Person> getAllPerson() {
		return PersonService.getAllPersons();
	}
}
