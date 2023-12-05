package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void TestMutant1(){
        TritypeMutantOne tri = new TritypeMutantOne();
        assertEquals(2, tri.Triang(1, 1, 2));
    }
    @Test
    public void TestMutant2(){
        TritypeMutantTwo tri = new TritypeMutantTwo();
        assertEquals(2, tri.Triang(1, 1, 2));
    }
}