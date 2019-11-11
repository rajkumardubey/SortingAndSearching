package self.learning.searching;

import self.learning.searching.algorithms.BinarySearch;
import self.learning.searching.algorithms.LinearSearch;
import self.learning.searching.algorithms.Search;

public class Main {
    public static void main(String[] args) {
        testNormalSearchAlgorithm();
        testBinarySearchAlgorithm();
    }

    private static void testNormalSearchAlgorithm() {
        final int[] input = {5, 9, 1, 0, 7, 8, 2};

        final Search linearSearch = new LinearSearch();

        final int result1 = linearSearch.search(input, 10);
        if (result1 == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result1);

        final int result2 = linearSearch.search(input, 2);
        if (result2 == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result2);

    }

    private static void testBinarySearchAlgorithm() {
        final int[] input = {2, 3, 4, 10, 40};

        final Search binarySearch = new BinarySearch();

        final int result1 = binarySearch.search(input, 10);
        if (result1 == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result1);

        final int result2 = binarySearch.search(input, 5);
        if (result2 == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result2);
    }
}
