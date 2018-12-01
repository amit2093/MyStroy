package com.MyStory.Person;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonService {

	public Person create(PersonDto personDto);
	
	public List<Person> getAllPersons();
	
}
