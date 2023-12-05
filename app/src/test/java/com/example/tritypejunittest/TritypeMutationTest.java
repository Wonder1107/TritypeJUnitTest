package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriang() {

        TritypeMutantOne tri1 = new TritypeMutantOne();
        TritypeMutantTwo tri2 = new TritypeMutantTwo();

        assertEquals(2, tri1.Triang(1, 1, 2));
        assertEquals(2, tri2.Triang(1, 1, 2));
    }
}