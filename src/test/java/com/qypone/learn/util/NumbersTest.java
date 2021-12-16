package com.qypone.learn.util;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    public void test() {
        int addResult = Numbers.add(3, 4);
        assertEquals(7, addResult);
    }

    @Test
    public void testDouble() {
        double addResult = 0.1 + 0.2;
        System.out.println(addResult);
    }
}