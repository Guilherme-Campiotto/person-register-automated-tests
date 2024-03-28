package br.com.person.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String address, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public Person(Long id, String firstName, String lastName, String address, String email, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }
}
