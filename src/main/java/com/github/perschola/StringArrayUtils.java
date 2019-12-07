package com.github.perschola;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s: array) {
            if (s.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        int length = array.length;
        String temp;

        for(int i = 0; i < (length/2); i++) {
            temp = array[length - 1 - i];
            array[length - 1 - i] = array[i];
            array[i] = temp;
        }

        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {

        int length = array.length;
        int iterations = array.length / 2;
        for (int i = 0; i < iterations; i ++)
        {
            if (!array [i].equals(array [length - 1 - i]))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {

        Set<Integer> alphabet = new HashSet<>();

        for (int i = 65; i < 91; i++)
            alphabet.add(i);

        for (int k = 65; k < 91; k++)
            for (String s : array)
                for (int j = 0; j < s.length(); j++) {
                    if (((int) s.charAt(j) == k) || ((int) s.charAt(j) == (k + 32)))
                        alphabet.remove(k);
                }

        return alphabet.isEmpty();
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int occurrence = 0;

        if (!contains(array, value))
            return 0;
        else {
            for (String s : array)
                if (s.equals(value))
                    occurrence++;
            return occurrence;
        }
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        if (!contains(array, valueToRemove))
            return array;

        List<String> newArray = new ArrayList<>();

        for (String s : array) {
            if (!s.equals(valueToRemove)) {
                newArray.add(s);
            }
        }

        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> result = new ArrayList<>(Arrays.asList(packConsecutiveDuplicates(array)));

        result.removeIf(s -> s.length() > 1);

        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        int startIndex, endIndex;
        startIndex = 0;
        endIndex = startIndex + 1;
        List<String> newArray = new ArrayList<>();

        while (endIndex < array.length)
        {

            boolean duplicate = true;
            StringBuilder temp = new StringBuilder(array[startIndex]);

            while (duplicate && (endIndex < array.length))
            {
                if (array[startIndex].equals(array[endIndex])) {
                    temp.append(array[endIndex]);
                    endIndex++;
                    duplicate = true;
                }
                else
                    duplicate = false;
            }

            newArray.add(temp.toString());
            startIndex = endIndex;
            endIndex++;

            if (startIndex == (array.length - 1) && (endIndex == array.length)) {
                newArray.add(array[startIndex]);
                break;
            }
        }
        return newArray.toArray(new String[0]);
    }


}
