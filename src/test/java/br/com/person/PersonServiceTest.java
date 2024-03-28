package br.com.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.person.model.Person;
import br.com.person.service.IPersonService;
import br.com.person.service.PersonService;


public class PersonServiceTest {

    Person person;
    IPersonService personService;

    @BeforeEach
    void setupPerson() {
        person = new Person("John", "Stewart", "Wembley - UK", "john.stewart@email.com", "Male");
    }

    @BeforeEach
    void setupPersonService() {
        personService = new PersonService();
    }

    

	@Test
    @DisplayName("When creating a person with success should return Person object")
	void testCreatePersonWhenSuccessShouldReturnPerson() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved, "Method createPerson should not return null.");  
    }

    @Test
    @DisplayName("When creating a person with success should have an id")
	void testCreatePersonWhenSuccessShouldContainIdInReturnedObject() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved.getId(), "Person id should not be null.");
    }

    @Test
    @DisplayName("When creating a person with success should have the field firstName")
	void testCreatePersonWhenSuccessShouldContainFirstNameInReturnedObject() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved.getFirstName(), "First name should not be null.");
        Assertions.assertEquals(person.getFirstName(), personSaved.getFirstName(), "First name is not the same.");
    }

    @Test
    @DisplayName("When creating a person with success should have the field lastName")
	void testCreatePersonWhenSuccessShouldContainLastNameInReturnedObject() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved.getLastName(), "Last name should not be null.");
        Assertions.assertEquals(person.getLastName(), personSaved.getLastName(), "Last name is not the same.");
    }

    @Test
    @DisplayName("When creating a person with success should have the field Address")
	void testCreatePersonWhenSuccessShouldContaiAddressInReturnedObject() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved.getAddress(), "Address should not be null.");
        Assertions.assertEquals(person.getAddress(), personSaved.getAddress(), "Address is not the same.");
    }

    @Test
    @DisplayName("When creating a person with success should have the field Email")
	void testCreatePersonWhenSuccessShouldContaiEmailInReturnedObject() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved.getEmail(), "Email should not be null.");
        Assertions.assertEquals(person.getEmail(), personSaved.getEmail(), "Email is not the same.");
    }

    @Test
    @DisplayName("When creating a person with success should have the field gender")
	void testCreatePersonWhenSuccessShouldContaiGenderInReturnedObject() {
        Person personSaved = personService.createPerson(person);
        Assertions.assertNotNull(personSaved.getGender(), "Gender should not be null.");
        Assertions.assertEquals(person.getGender(), personSaved.getGender(), "Gender is not the same.");
    }

    @Test
    @DisplayName("When creating a person with a null email should throw Exception")
	void testCreatePersonWhenEmailIsNullShouldThrowIllegalArgumentException() {
        person.setEmail(null);
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.createPerson(person), "An null email should throw IllegalArgumentException");
    }
}
