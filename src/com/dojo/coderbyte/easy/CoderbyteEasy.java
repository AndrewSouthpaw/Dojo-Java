package com.dojo.coderbyte.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoderbyteEasy {

    public static void main() {
    }

    /**
     * Have the function FirstReverse(str) take the str parameter being passed
     * and return the string in reversed order.
     */
    public String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}
