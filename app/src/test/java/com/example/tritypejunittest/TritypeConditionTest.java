package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    // 选择line 53 desision
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0, 0, 0));
        assertEquals(3, tri.Triang(2, 2, 2));
    }

}