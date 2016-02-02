package com.dojo;

/**
 * Created by andrewsm on 2/2/16.
 */
public class BinarySearch {

    private BinarySearch() {
        // utility class should not be instantiable
    }

    public int find(int[] vals, int target) {
        int left = 0;
        int right = vals.length - 1;
        while (left < right) {
            int middle = (right + left) / 2;
            if (vals[middle] == target) return middle;
            if (target < vals[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    // recursive version
    public int findRecursive(int[] vals, int target) {
        return findRecursiveHelper(vals, target, 0, vals.length - 1);
    }

    private int findRecursiveHelper(int[] vals, int target, int left, int right) {
        int middle = (left + right) / 2;
        if (target == vals[middle]) return middle;
        if (target < vals[middle]) return findRecursiveHelper(vals, target, left, middle - 1);
        return findRecursiveHelper(vals, target, middle + 1, right);
    }
}
