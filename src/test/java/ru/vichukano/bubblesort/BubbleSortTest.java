package ru.vichukano.bubblesort;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortThenSortArrayInNaturalOrder() {
        int[] first = {5, 3, 1, -5, 20, 100};
        int[] second = {51, 11, 42, -5, 0, -3, 10, 19, 22};
        int[] third = {0, 1, 4, 3, 3, 3, -15, -21, -33, -54, -32, 156};
        assertThat(
                Arrays.toString(BubbleSort.sort(first)),
                is(Arrays.toString(new int[]{-5, 1, 3, 5, 20, 100}))
        );
        assertThat(
                Arrays.toString(BubbleSort.sort(second)),
                is(Arrays.toString(new int[]{-5, -3, 0, 10, 11, 19, 22, 42, 51}))
        );
        assertThat(
                Arrays.toString(BubbleSort.sort(third)),
                is(Arrays.toString(new int[]{-54, -33, -32, -21, -15, 0, 1, 3, 3, 3, 4, 156}))
        );
    }

    @Test(expected = MyException.class)
    public void whenArrayIsNotInitializedThenThrowException() {
        int[] arr = null;
        int[] empty = {};
        BubbleSort.sort(arr);
        BubbleSort.sort(empty);
    }
}
