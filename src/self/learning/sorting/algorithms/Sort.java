package self.learning.sorting.algorithms;

import java.util.Arrays;

public abstract class Sort {
    public abstract int[] sortIntArray(final int[] input);

    public String algorithmName() {
        return getClass().getSimpleName();
    }

    void swap(final int[] input, final int index1, final int index2) {
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}
