package ru.vichukano.person;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    @Test
    public void whenPersonsEqualsThenReturnTrue() {
        Person first = new Person(
                "Mike",
                "Tyson",
                50
        );
        Person second = new Person(
                "Mike",
                "Tyson",
                50
        );
        assertThat(first.equals(second), is(true));
        assertThat(second.equals(first), is(true));
    }

    @Test
    public void whenPersonsNotEqualsThenReturnFalse() {
        Person first = new Person(
                "Mike",
                "Tyson",
                50
        );
        Person second = new Person(
                "Mark",
                "Hunt",
                50
        );
        assertThat(first.equals(second), is(false));
        assertThat(second.equals(first), is(false));
    }
}
