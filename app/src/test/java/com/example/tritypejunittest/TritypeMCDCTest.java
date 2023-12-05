package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    // 选择line 53 desision

    @Test
    public void testTriang() {
        // 选择line 53 desision
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(4, tri.Triang(0, 2, 2));
        assertEquals(4, tri.Triang(2, 0, 2));
        assertEquals(4, tri.Triang(2, 2, 0));
    }
}