package ru.vichukano.array;

import ru.vichukano.bubblesort.MyException;

/**
 * Class with arithmetic operations on an array methods.
 */
public class ArrayOperations {

    /**
     * Method calculate division of difference max and min elements by average.
     *
     * @param sourceArray array of doubles.
     * @return division of difference max and min elements by average.
     * @throws MyException may throw if array is not initialized
     *                     and average of array equals 0.0
     */
    public static double foo(double[] sourceArray) throws MyException {
        if (sourceArray == null || sourceArray.length == 0) {
            throw new MyException("Array is empty or not initialized.");
        }
        double average = findAverage(sourceArray);
        if (average == 0.0) {
            throw new MyException("NaN exception.");
        }
        return (findMaximum(sourceArray) - findMinimum(sourceArray)) / average;
    }

    /**
     * Method for finding minimal element in the array.
     *
     * @param arr sourceArray
     * @return minimal element.
     */
    private static double findMinimum(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Method for finding maximal element in the array.
     *
     * @param arr sourceArray
     * @return maximal element.
     */
    private static double findMaximum(double[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Method for finding average.
     *
     * @param arr source array.
     * @return average.
     */
    private static double findAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


}
