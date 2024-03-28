package br.com.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.person.model.Person;
import br.com.person.service.IPersonService;
import br.com.person.service.PersonService;


public class PersonServiceTest {

	@Test
    @DisplayName("When creating a person with success should return should return Person object")
	void testCreatePersonWhenSuccessShouldReturnPerson() {
        IPersonService personService = new PersonService();
        Person person = new Person("John", "Stewart", "john.stewart@email.com", "Wembley - UK", "Male");
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved, "Method createPerson should not return null.");  
    }
}
