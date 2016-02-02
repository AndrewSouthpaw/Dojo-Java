package com.dojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andrewsm on 2/2/16.
 */
public class ThreeSum {

    private ThreeSum() {}

    public static int countThreesSumToTarget(int[] vals, int target) {
        int count = 0;
        Arrays.sort(vals);
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length; j++) {
                int search = Arrays.binarySearch(vals, target - vals[i] - vals[j]);
                if (search > -1 && vals[i] < vals[j] && vals[j] < vals[search]) count++;
            }
        }

        return count;
    }


}
