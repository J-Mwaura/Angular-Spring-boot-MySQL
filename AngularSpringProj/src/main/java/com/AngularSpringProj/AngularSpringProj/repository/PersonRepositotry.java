package com.AngularSpringProj.AngularSpringProj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AngularSpringProj.AngularSpringProj.entity.Person;

public interface PersonRepositotry extends JpaRepository<Person, Integer> {
void deletePersonById(int id);
Optional<Person> findPersonById(int id);
}
