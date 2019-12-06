package com.github.perschola;

import java.util.HashSet;
import java.util.Set;

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

        String [] reverseArray = new String [array.length];
        int length = array.length;

        for(int i = 0; i < length; i++)
            reverseArray [i] = array [length - 1 -i];
        return reverseArray;
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

        int letter = 97;
        Set<Integer> alphabet = new HashSet<Integer>();

        for (int i = 65; i < 91; i++)
            alphabet.add(i);

        for (int k = 65; k < 91; k++)
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[i].length(); j++) {
                    if (((int) array[i].charAt(j) == k) || ((int) array[i].charAt(j) == (k + 32)))
                        alphabet.remove(k);
                }

        if (alphabet.isEmpty())
            return true;
        else
            return false;
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
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(value))
                    occurrence++;
            }
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

        if (getLastElement(array).equals(valueToRemove)) {
            array[array.length - 1] = null;
            return array;
        }

        else
        {
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(valueToRemove)) {
                    index = i;
                    break;
                }
            }

            for (int i = (index + 1); i < array.length; i++)
                array[i - 1] = array[i];
            array[array.length - 1] = null;

            return array;
        }

        /*int indexOfNewArray = 0;
        int difference = getNumberOfOccurrences(array, valueToRemove);

        String [] newArray = new String[array.length - difference];

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray[indexOfNewArray] = array[i];
                indexOfNewArray++;
            }
        }*/

        //return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
