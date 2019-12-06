package com.github.perschola;

import org.junit.Assert;
import org.junit.Test;

public class RemoveValueTest {

    private void test(String[] array, String[] expected) {
        String[] actual = StringArrayUtils.removeValue(array, "The");
        Assert.assertEquals(expected, actual);
    }

    private void test1(String[] array, String[] expected) {
        String[] actual = StringArrayUtils.removeValue(array, "quick");
        Assert.assertEquals(expected, actual);
    }

    private void test2(String[] array, String[] expected) {
        String[] actual = StringArrayUtils.removeValue(array, "jumps");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue() {
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        test(array, expected);
    }

    @Test
    public void testRemoveValue1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        test(array, expected);
    }

    @Test
    public void testRemoveValue2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        test(array, expected);
    }

    @Test
    public void testRemoveValue3() {
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"The", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        test1(array, expected);
    }

    @Test
    public void testRemoveValue4() {
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"The", "quick", "brown", "fox", "over", "the", "lazy", "dog"};
        test2(array, expected);
    }


}
