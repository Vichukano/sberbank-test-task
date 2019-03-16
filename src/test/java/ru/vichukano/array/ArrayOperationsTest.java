package ru.vichukano.array;

import org.junit.Test;
import ru.vichukano.bubblesort.MyException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayOperationsTest {

    @Test
    public void whenFooThenCalculateDivisionOfArray() {
        double[] first = {0.0, 2.0, 4.0, 6.0};
        double[] second = {-0.5, -2.5, 0.0, 10.5, 3.0};
        double[] third = {5.5, 5.5, 5.5, 5.5};
        assertThat(ArrayOperations.foo(first), is(2.0));
        assertThat(ArrayOperations.foo(second), is(6.19047619047619));
        assertThat(ArrayOperations.foo(third), is(0.0));
    }

    @Test(expected = MyException.class)
    public void whenArrayIsNotInitializedThenThrowException() {
        double[] arr = null;
        double[] empty = {};
        ArrayOperations.foo(arr);
        ArrayOperations.foo(empty);
    }

    @Test(expected = MyException.class)
    public void whenAverageIsZeroThenThrowException() {
        double[] arr = {0.0, 0.0, 0.0};
        double[] nullable = new double[10];
        ArrayOperations.foo(arr);
        ArrayOperations.foo(nullable);
    }
}
