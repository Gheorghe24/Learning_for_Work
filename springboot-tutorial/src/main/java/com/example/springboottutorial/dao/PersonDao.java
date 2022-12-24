package com.example.springboottutorial.dao;

import com.example.springboottutorial.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(final UUID ID, final Person person);
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    int deletePersonById(UUID id);
    int updatePersonById(UUID ID, Person person);
    Optional<Person> selectPersonById(UUID id);
}
