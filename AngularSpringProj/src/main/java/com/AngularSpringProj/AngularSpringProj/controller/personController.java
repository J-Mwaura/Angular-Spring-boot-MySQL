package com.AngularSpringProj.AngularSpringProj.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AngularSpringProj.AngularSpringProj.entity.Person;
import com.AngularSpringProj.AngularSpringProj.service.PersonService;

@RestController
@RequestMapping("/person")
public class personController {
	private final PersonService personService;

	public personController(PersonService personService) {
		
		this.personService = personService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Person>>getAllPersons(){
		List<Person> persons = personService.findAllPersons();
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Person>getPersonById(@PathVariable("id") int id){
		Person persons = personService.findPersonById(id);
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Person> addPerson(@RequestBody Person person){
		Person persons = personService.addPerson(person);
		return new ResponseEntity<>(persons, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Person> updatePerson(@RequestBody Person person){
		Person persons = personService.updatePerson(person);
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable("id") int id){
		personService.deletePerson(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
	