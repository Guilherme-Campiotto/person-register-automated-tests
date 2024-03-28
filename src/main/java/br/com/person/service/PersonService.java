package br.com.person.service;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

import br.com.person.model.Person;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
        Long id = new AtomicLong().incrementAndGet();
        person.setId(id);

        if(Objects.isNull(person.getEmail()) || person.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Person email is mandatory, it can't be null or empty.");
        }

        return person;
    }

}
