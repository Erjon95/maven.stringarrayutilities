package com.github.perschola;

import org.junit.Assert;
import org.junit.Test;

public class RemoveConsecutiveDuplicatesTest {
    // given
    private void test(String[] array, String[] expected) {
        // when
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveConsecutiveDuplicates1() {
        // given
        String[] array = {"a", "a", "a", "b", "c", "c", "a", "a", "d"};
        String[] expected = {"b", "d"};
        test(array, expected);
    }


    @Test
    public void testRemoveConsecutiveDuplicates2() {
        // given
        String[] array = {"t", "t", "q", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e"};
        String[] expected = {"q", "b", "d"};
        test(array, expected);
    }



    @Test
    public void testRemoveConsecutiveDuplicates3() {
        // given
        String[] array = {"m", "o", "o", "n", "m", "a", "n"};
        String[] expected = {"m", "n", "m", "a", "n"};
        test(array, expected);
    }
}
