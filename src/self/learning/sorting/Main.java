package self.learning.sorting;

import self.learning.sorting.algorithms.*;

import java.time.Instant;
import java.util.Arrays;

public class Main {

    private static final String SORTING_ALGORITHMS_PACKAGE_PATH = "self.learning.sorting.algorithms.";

    public static void main(String[] args) {
        Arrays.asList("Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort", "Heap Sort")
                .forEach(algorithmName -> sort(getSortingAlgorithm(algorithmName), algorithmName));
    }

    private static void sort(final Sort sort, final String algorithmName) {
        boolean result;
        System.out.println("\n\nRunning " + algorithmName + "..........\n");

        final int start = Instant.now().getNano();
        result = SortingTestRunner.runTestOnSortingAlgorithm(sort);
        final int end = Instant.now().getNano();

        System.out.println(algorithmName + (result ? " Passed" : " Failed"));
        System.out.println("Time Taken by " + algorithmName + " : " + (end - start) + " nano seconds");
        System.out.println("************************************************************************");
    }

    private static Sort getSortingAlgorithm(String algorithmName) {
        try {
            return (Sort) Class.forName(SORTING_ALGORITHMS_PACKAGE_PATH + algorithmName.replaceAll("\\s", "")).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            /* if we do not find any sorting algorithm from given name return a sorting algorithm which will return the same array. */
            return getNoneWorkingSortAlgorithm();
        }
    }

    private static Sort getNoneWorkingSortAlgorithm() {
        return new Sort() {
            @Override
            public int[] sortIntArray(int[] input) {
                return input;
            }
        };
    }
}
