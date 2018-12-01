package com.MyStory.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person create(PersonDto personDto) {
		Person person = new Person();
		person.setName(personDto.getName());
		person.setEmail(personDto.getEmail());
		return personRepository.save(person);
	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> personList = new ArrayList<Person>();
		
		Iterable<Person> iterable = personRepository.findAll();
		Iterator<Person> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			personList.add(person);
	    }
		
		return personList;
	}

}
