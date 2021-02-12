package com.AngularSpringProj.AngularSpringProj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AngularSpringProj.AngularSpringProj.entity.Person;
import com.AngularSpringProj.AngularSpringProj.repository.PersonRepositotry;

import exception.personNotFoundException;

@Service
@Transactional
public class PersonService {
	private final PersonRepositotry personRepo;

	// have repo whenever serviceis constructed
	@Autowired
	public PersonService(PersonRepositotry personRepo) {
		this.personRepo = personRepo;	}
	
	public Person addPerson(Person person) {
		return personRepo.save(person);
	}
	
	public List<Person> findAllPersons(){
		return personRepo.findAll();	
	}
	
	public Person updatePerson(Person person) {
		return personRepo.save(person);
	}
	
	public Person findPersonById(int id) {
		return personRepo.findPersonById(id).orElseThrow(() -> new personNotFoundException("Person ID " + id + "was not found"));
	}
	
	public void deletePerson(int id) {
		personRepo.deletePersonById(id);
	}
}
