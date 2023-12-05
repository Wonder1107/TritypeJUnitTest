package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));   //不是三角形
        assertEquals(4, tri.Triang(2, 2, 4));   //不是三角形
        assertEquals(4, tri.Triang(0, 2, 2));   //边 <= 0
        assertEquals(1, tri.Triang(3, 4, 5));   //普通三角形
        assertEquals(2, tri.Triang(3, 3, 2));   //等腰三角形
        assertEquals(2, tri.Triang(3, 2, 3));   //等腰三角形
        assertEquals(2, tri.Triang(2, 3, 3));   //等腰三角形
        assertEquals(3, tri.Triang(1, 1, 1));   //等边三角形
    }
}