package br.com.person.service;

import br.com.person.model.Person;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
        // save instance
        return person;
    }

}
