package com.MyStory.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class PersonController {

	int i = 1;
	
	@Autowired
	private PersonService PersonService;
	
	@GetMapping(ConfigMain.SAVE_PERSON)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
    public void create(PersonDto personDto){ 
		personDto.setId(i);
		personDto.setName("Kratika");
		personDto.setEmail("kukkku@gmail.com");
		i++;
		PersonService.create(personDto);
    }
	
	@GetMapping(ConfigMain.GET_ALL_PERSONS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<Person> getAllPerson() {
		return PersonService.getAllPersons();
	}
}
