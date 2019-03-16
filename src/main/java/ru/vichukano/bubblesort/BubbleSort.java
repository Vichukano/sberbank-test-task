package ru.vichukano.bubblesort;

/**
 * Simple Bubble Sorting realization class.
 */
public class BubbleSort {

    public BubbleSort() {

    }

    /**
     * Static method for sorting array with bubble - sort algorithm.
     *
     * @param sourceArray array of int.
     * @return sorted array.
     * @throws MyException may throw if array was not initialized.
     */
    public static int[] sort(int[] sourceArray) throws MyException {
        if (sourceArray == null) {
            throw new MyException("Array is empty or not initialized.");
        }
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < sourceArray.length - i - 1; j++) {
                if (sourceArray[j] > sourceArray[j + 1]) {
                    int temp = sourceArray[j];
                    sourceArray[j] = sourceArray[j + 1];
                    sourceArray[j + 1] = temp;
                }
            }
        }
        return sourceArray;
    }
}
