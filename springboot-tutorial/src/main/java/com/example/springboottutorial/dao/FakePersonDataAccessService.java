package com.example.springboottutorial.dao;

import com.example.springboottutorial.model.Person;
import lombok.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static final List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, @Valid @NonNull Person person) {
        DB.add(new Person(id, person.getName()));
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> optionalPerson = selectPersonById(id);
        if (optionalPerson.isEmpty()) {
            return 0;
        }
        DB.remove(optionalPerson.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, @Valid @NonNull Person person) {
        return selectPersonById(id)
                .map(p -> {
                    int indexOfPersonToDelete = DB.indexOf(p);
                    if (indexOfPersonToDelete >= 0) {
                        DB.set(indexOfPersonToDelete, new Person(id, person.getName()));
                        return 1;
                    }
                    return 0;
                }).orElse(0);
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }
}
