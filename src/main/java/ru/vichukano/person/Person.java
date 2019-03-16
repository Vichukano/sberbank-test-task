package ru.vichukano.person;

import java.util.Objects;

/**
 * POJO Person class.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person() {

    }

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Persons equivalence comparison method.
     * @param o Person object.
     * @return true if equals, else false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return String.format(
                "Person: "
                        + "firstName = %s, "
                        + "lastName = %s, "
                        + "age = %d",
                firstName,
                lastName,
                age
        );
    }
}
