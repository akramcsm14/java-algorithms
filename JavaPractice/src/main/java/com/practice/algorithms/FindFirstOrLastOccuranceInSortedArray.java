package com.practice.algorithms;

public class FindFirstOrLastOccuranceInSortedArray {

    // Function to find first occurrence of a given number
    // in sorted array of integers
    public static int findFirstOccurrence(int[] A, int x) {
        // search space is A[left..right]
        int left = 0;
        int right = A.length - 1;

        // initialize the result by -1
        int result = -1;

        // iterate till search space contains at-least one element
        while (left <= right) {
            // find the mid value in the search space and
            // compares it with key value
            int mid = (left + right) / 2;

            // if key is found, update the result and
            // go on searching towards left (lefter indices)
            if (x == A[mid]) {
                result = mid;
                right = mid - 1;
            }

            // if key is less than the mid element, discard right half
            else if (x < A[mid]) {
                right = mid - 1;
            }

            // if key is more than the mid element, discard left half
            else {
                left = mid + 1;
            }
        }

        // return the leftmost index or -1 if the element is not found
        return result;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int key = 5;

        int index = findFirstOccurrence(A, key);

        if (index != -1) {
            System.out.println("First occurrence of element " + key +
                    " is found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
